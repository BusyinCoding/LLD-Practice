import java.util.Scanner;

public class WithDrawState extends ATMState{

    public WithDrawState()
    {
        System.out.println("Please enter amount to withDraw");
    }

    @Override
    public void withdrawAmount(ATM atm, User user) {
       Scanner s = new Scanner(System.in);
       double amount = Double.parseDouble(s.nextLine());
       if(amount > user.getBankAccount().getBalance())
       {
           System.out.println("Insufficient Balance");
           exit(user, atm);
       }
       else if(amount > atm.getAmountAvailable())
       {
           System.out.println("ATM has insufficient cash");
           exit(user, atm);
       }
       else
       {
            user.getBankAccount().deductAmount(amount);
            atm.deductAmount(amount);
            CashWithDrawProcessor cashWithDrawProcessor = new TwoThousandCashWithDrawProcessor(new FiveHundredCashWithDrawProcessor(new TwoHundredCashWithDrawProcessor(new HundredCashWithDrawProcessor(null))));
            cashWithDrawProcessor.withDrawCash(atm, amount);
            System.out.println("Please collect your cash: " + amount);
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
