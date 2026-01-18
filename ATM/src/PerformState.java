public class PerformState extends ATMState {

    TransactionType transactionType;

    public PerformState(TransactionType trasaction) {
        this.transactionType = trasaction;
    }

    public void performTransaction(ATM atm, User user) {
        switch (transactionType) {
            case CHECK_BALANCE:
                atm.setCurrentState(new CheckBalanceState());
                atm.getAtmState().checkBalance(atm, user);
                break;
            case WITHDRAW:
                atm.setCurrentState(new WithDrawState());
                atm.getAtmState().withdrawAmount(atm, user);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                exit(user, atm);
                break;
        }


    }

    public Card exit(User user, ATM atm) {
        System.out.println("Moving back to Idle State. Ejecting Card.");
        atm.setCurrentState(new IdleState());
        return user.getUserCard();
    }
}




