import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class ThreatreController {

    private final ThreatreService threatreService;

    public ThreatreController() {
        this.threatreService = new ThreatreService();
    }

    public void addThreatre(Threatre threatre) {
        threatreService.addThreatre(threatre);
    }

    public Set<Movie> getMovies(CityEnum city, LocalDate date) {
        return threatreService.getMovies(city, date);
    }

    public List<Threatre> getThreatres(CityEnum city, Movie movie, LocalDate date) {
        return threatreService.getThreatres(city, movie, date);
    }
    public List<Show> getShows(Movie movie, LocalDate date, Threatre threatre) {
        return threatreService.getShows(movie, date, threatre);
    }
}
