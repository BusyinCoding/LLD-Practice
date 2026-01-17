public class EntryGate {

    public Ticket Entry(Vehicle vehicle, Building building)
    {
        return building.allocateSpace(vehicle);
    }
}
