import java.util.List;

public class Building {
    List<Level> levels;
    Building(List<Level> levels){
        this.levels = levels;
    }
    public Ticket allocateSpace(Vehicle vehicle)
    {
        for(Level level : levels)
        {
            if(level.hasAvailability(vehicle.vehicleType)){
                ParkingSpot spot = level.park(vehicle);
                if(spot == null)
                {
                    return null;
                }
                return new Ticket(spot, level.getLevelId());
            }
        }
        return null;
    }
    public void deAllocateSpace(Ticket ticket, VehicleType vehicleType)
    {
        levels.get(ticket.levelId).unPark(ticket.parkingSpot, vehicleType);
    }

}
