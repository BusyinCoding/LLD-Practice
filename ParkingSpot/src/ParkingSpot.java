public class ParkingSpot {
    String parkingSpotId;
    Vehicle vehicle;
    boolean isFree;

    public ParkingSpot(String parkingSpotId)
    {
        this.parkingSpotId = parkingSpotId;
        this.isFree = true;
    }

    public boolean isSpotFree()
    {
        return isFree;
    }
    public void occupySpot(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        isFree = false;
    }
    public void freeSpot()
    {
        this.vehicle = null;
        isFree = true;
    }
    public Vehicle getVehicle()
    {
        return vehicle;
    }



}
