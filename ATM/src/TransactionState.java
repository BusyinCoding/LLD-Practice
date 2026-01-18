import java.util.Scanner;

public class TransactionState extends ATMState{
    public TransactionState()
    {
        System.out.println("Select Transaction Type:");
        TransactionType.showTransactionOptions();
    }

    @Override
    public void selectOption(ATM atm, User user) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice = s.nextLine().toUpperCase();
        try{
            TransactionType transactionType = TransactionType.valueOf(choice);
            atm.setCurrentState(new PerformState(transactionType));}
        catch(Exception e)
        {
            System.out.println("Invalid choice. Please try again.");
            exit(user, atm);
        }

    }
    public Card exit(User user, ATM atm)
    {
        System.out.println("Moving back to Idle State. Ejecting Card.");
        atm.setCurrentState(new IdleState());
        return user.getUserCard();
    }



}
