public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, User user) {
        System.out.println("Please enter your card");
        System.out.println("Card Inserted");
        atm.setCurrentState(new AuthenticationState());
    }

}
