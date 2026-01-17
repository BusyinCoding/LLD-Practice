import java.util.List;

public class RandomStrategdy implements ParkingStrategdy{

    @Override
    public ParkingSpot parkingLookUpStrategy(List<ParkingSpot> parkingSpots){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isSpotFree()){
                return spot;
            }
        }
        return null;
    }

}
