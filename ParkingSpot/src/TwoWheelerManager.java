import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class TwoWheelerManager extends ParkingSpotManager{

    public TwoWheelerManager(List<ParkingSpot>spots, ParkingStrategdy parkingStrategdy)
    {
        super(spots, parkingStrategdy);
    }

}
