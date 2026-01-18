public abstract class ATMState {
    public void insertCard(ATM atm, User user) {
        System.out.println("Operation not allowed in current state.");
    }
    public void enterPin(ATM atm, String pin, User user) {
        System.out.println("Operation not allowed in current state.");
    }
    public void selectOption(ATM atm, User user) {
        System.out.println("Operation not allowed in current state.");
    }
    public void withdrawAmount(ATM atm, User user) {
        System.out.println("Operation not allowed in current state.");
    }
    public double checkBalance(ATM atm, User user) {
        System.out.println("Operation not allowed in current state.");
        return 0;
    }
    public void performTransaction(ATM atm, User user) {
        System.out.println("Operation not allowed in current state.");
    }

}
