import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    //user -> booking app -> select date and city -> show movies available -> select movie ->
// show threatre available -> select threatre -> show timings -> select timing -> show seats available ->
// select seats -> payment -> confirmation
//    city -> threatre -> screen -> show, seates -> seat status -> booking -> payment
//    Concurrency(how to handle multiple users booking same seat at same time) , Scalability, Reliability
//    where to apply lock
//    on show?(but what if users are booking different seats)
//    on seat level?(what if they are booking multiple seat)
//    if user 1 is booking from s1 to s5 and user 2 s5 to s10 do sorting
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ThreatreController threatreController = new ThreatreController();
         BookingController bookingController = new BookingController();
         Movie bahubali = new Movie("Bahubali");
         Screen inoxScreen = new Screen(1, createSeats());
          Threatre inox = new Threatre("Inox", CityEnum.Gurgaon, List.of(inoxScreen));
          threatreController.addThreatre(inox);
          Show show1 = new Show(bahubali, inoxScreen, LocalDate.now(), LocalTime.of(8, 0));
          inoxScreen.addShow(show1);
        User user = new User(1, "Japleen");
        Set<Movie> movies = threatreController.getMovies(CityEnum.Gurgaon, LocalDate.now());
        movies.forEach(m -> System.out.println(" - " + m.getName()));


    }
    public static List<Seat> createSeats()
    {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            seats.add(new Seat(i, SeatCategory.SILVER));
        }
        return seats;
    }

}