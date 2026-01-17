import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreatreService {
    private final Map<CityEnum, List<Threatre>> cityToThreatreMapping = new HashMap<>();

    public void addThreatre(Threatre threatre)
    {
        cityToThreatreMapping.computeIfAbsent(threatre.getCity(), k -> new ArrayList<>()).add(threatre);
    }

    public Set<Movie> getMovies(CityEnum city, LocalDate date)
    {
        Set<Movie> movies = new HashSet<>();
        List<Threatre> threatres = cityToThreatreMapping.getOrDefault(city, List.of());
        for(Threatre threatre: threatres) {
         for(Screen s: threatre.getScreens())
         {
             for(Show show: s.getShows(date))
             {
                 movies.add(show.movie);
             }
         }
        }
        return movies;
    }

    public List<Threatre> getThreatres(CityEnum city, Movie movie, LocalDate localDate)
    {
        List<Threatre> threatres = cityToThreatreMapping.getOrDefault(city, List.of());
        return threatres.stream().filter(t -> t.getScreens().stream().anyMatch(s -> s.getShows(localDate).stream().anyMatch(show -> show.movie.equals(movie)))).toList();
    }

    public List<Show> getShows(Movie movie, LocalDate date, Threatre threatre)
    {
        List<Show> result = new ArrayList<>();
        for(Screen s: threatre.getScreens())
        {
            for(Show show: s.getShows(date))
            {
                if(show.movie.equals(movie))
                {
                    result.add(show);
                }
            }
        }
        return result;
    }


}
