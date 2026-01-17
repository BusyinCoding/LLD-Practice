import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ParkingSpotManager {

    List<ParkingSpot> parkingSpots;
    ParkingStrategdy parkingStrategdy;
    ReentrantLock reentrantLock;

    public ParkingSpotManager(List<ParkingSpot>spots, ParkingStrategdy parkingStrategdy)
    {
        this.parkingSpots = spots;
        this.parkingStrategdy = parkingStrategdy;
        this.reentrantLock = new ReentrantLock();
    }

    public  ParkingSpot parkVehicle(Vehicle vehicle){
        reentrantLock.lock();
        try {
            ParkingSpot spot = parkingStrategdy.parkingLookUpStrategy(parkingSpots);
            if (spot == null) {
                return null;
            }
            spot.occupySpot(vehicle);
            return spot;
        }finally {
            reentrantLock.unlock();
        }
    }

    public  void unParkVehicle(ParkingSpot spot){
        reentrantLock.lock();
        try {
            spot.freeSpot();
        }finally {
            reentrantLock.unlock();
        }

    };
    public  boolean isSpotAvailable(){
       for(int i = 0; i < parkingSpots.size(); i++){
           if(parkingSpots.get(i).isSpotFree()){
               return true;
           }
       }
       return false;
    }

}
