public class CheckBalanceState extends ATMState{

    public CheckBalanceState()
    {
        System.out.println("Please wait. Showing your current Balance");
    }

    public double checkBalance(ATM atm, User user) {
        double balance = user.getBankAccount().getBalance();
        System.out.println("Your current balance is: " + balance);
        exit(user, atm);
        return balance;
    }

    public Card exit(User user, ATM atm)
    {
        System.out.println("Moving back to Idle State. Ejecting Card.");
        atm.setCurrentState(new IdleState());
        return user.getUserCard();
    }


}
