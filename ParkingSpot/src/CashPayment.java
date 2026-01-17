public class CashPayment implements Payment{
    @Override
    public boolean doPayment(double amount) {
        System.out.println("Processing cash payment of amount: " + amount);
        return true;
    }

}
