public class FixedPriceStrategdy implements PriceStrategdy{

    public double computeCost(Ticket ticket) {
        return 100; // Fixed price for any parking duration
    }

}
