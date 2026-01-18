public class AuthenticationState extends ATMState{

    @Override
    public void enterPin(ATM atm, String pin, User user) {
       boolean validPin = user.getUserCard().getCardPin().equals(pin);
        if(validPin){
            System.out.println("PIN is valid. You are now authenticated.");
            atm.setCurrentState(new TransactionState());
        } else {
            System.out.println("Invalid PIN. Please try again.");
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
