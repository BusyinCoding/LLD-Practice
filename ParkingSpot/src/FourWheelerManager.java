import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class FourWheelerManager extends ParkingSpotManager{

    public FourWheelerManager(List<ParkingSpot>spots, ParkingStrategdy parkingStrategdy)
    {
        super(spots, parkingStrategdy);
    }

}
