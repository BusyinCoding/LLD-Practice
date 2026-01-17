import java.util.List;
import java.util.UUID;

public class BookingController {

    BookingService bookingService;

    public BookingController()
    {
        bookingService = new BookingService();
    }


    public UUID createBooking(User u, Show s, List<Integer> seats) {
        return bookingService.createBooking(u, s, seats);
    }

    public Booking getBooking(UUID bookingId) {
        return bookingService.getBooking(bookingId);
    }

    public List<Booking> getBookingForUser(User user) {
        return bookingService.getBookingForUser(user);
    }


    public void cancelBooking(int bookingId) {
        //call booking service to cancel booking
    }
}
