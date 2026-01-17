import java.util.List;

public class Threatre {

    private String name;
    private CityEnum city;
    private List<Screen> screens;
    public Threatre(String name, CityEnum city, List<Screen> screens){
        this.name = name;
        this.city = city;
        this.screens = screens;
    }

    public CityEnum getCity()
    {
        return city;
    }
    public List<Screen> getScreens()
    {
        return screens;
    }


}
