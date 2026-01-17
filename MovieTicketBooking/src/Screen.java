import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Screen {

    int screenId;
    List<Seat> seats;
    private final Map<LocalDate, List<Show>> dateToShowsMapping = new HashMap<>();
    public Screen(int screenId, List<Seat> seats){
        this.screenId = screenId;
        this.seats = seats;
    }
    public List<Seat> getSeats()
    {
        return seats;
    }
    public void addShow(Show show)
    {
        dateToShowsMapping.computeIfAbsent(show.getShowDate(), k -> new java.util.ArrayList<>()).add(show);
    }

    public void removeShow(Show show)
    {
        dateToShowsMapping.get(show.getShowDate()).remove(show);
    }

    public List<Show> getShows(LocalDate date)
    {
        return dateToShowsMapping.get(date);
    }



}
