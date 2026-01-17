import java.util.HashMap;
import java.util.Map;

public class Level {

    int levelId;
    Map<VehicleType, ParkingSpotManager> map = new HashMap<>();
    public Level(int levelId, Map<VehicleType, ParkingSpotManager> map) {
        this.levelId = levelId;
        this.map = map;
    }
    public boolean hasAvailability(VehicleType vehicleType){
        return map.get(vehicleType).isSpotAvailable();
    }

    public ParkingSpot park(Vehicle vehicle){
        return map.get(vehicle.vehicleType).parkVehicle(vehicle);
    }
    public void unPark(ParkingSpot spot, VehicleType vehicleType){
        map.get(vehicleType).unParkVehicle(spot);
    }
    public int getLevelId()
    {
        return levelId;
    }

}
