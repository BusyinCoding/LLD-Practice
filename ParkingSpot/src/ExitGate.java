public class ExitGate {

    CostComputation costComputation;
    public ExitGate(CostComputation costComputation)
    {
        this.costComputation = costComputation;
    }
    public void completeExit(Ticket ticket, Building building, Payment payment)
    {
        double cost = costComputation.getCost();
        System.out.println("Please pay amount: " + cost);
        building.deAllocateSpace(ticket, ticket.parkingSpot.getVehicle().vehicleType);
        payment.doPayment(cost);

        System.out.println("Thank you for visiting. Have a nice day!");
    }
}
