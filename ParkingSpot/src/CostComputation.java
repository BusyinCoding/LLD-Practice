public class CostComputation {

    PriceStrategdy priceStrategdy;
    Ticket ticket;
    public CostComputation(PriceStrategdy priceStrategdy)
    {
        this.priceStrategdy = priceStrategdy;
        this.ticket = ticket;
    }
    public double getCost()
    {
        return priceStrategdy.computeCost(ticket);
    }
}
