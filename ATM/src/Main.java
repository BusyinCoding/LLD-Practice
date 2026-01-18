//state design pattern + chain of responsibilty pattern
//state design pattern:=> different operation perform in different state of object
//chain of responsibility pattern:=> different handler process request based on condition
//user -> INSERT card  -> PIN Authentication -> Give Option -> Select Operation -> Perform Operation -> Eject Card
//Idle state => has pin => Authenticated state => has option => Operation state => Eject state
//2000 note -> 500 note -> 100 note -> this is chain of responsibility
public class Main {

    public static void main(String[] args) {
        Card card = new Card("1234-5678-9012-2345", "1234", "12/25");
        BankAccount bankAccount = new BankAccount("9876543210", 25600);
       User japleen = new User(card, bankAccount);
        ATM atm = new ATM();
        atm.intialize();
        atm.addMoney(59200, 20, 35, 6, 5);
        atm.getAtmState().insertCard(atm, japleen);
        atm.getAtmState().enterPin(atm, "1234", japleen);
        atm.getAtmState().selectOption(atm, japleen);
        atm.getAtmState().performTransaction(atm,japleen);
        atm.getAtmState().insertCard(atm, japleen);
        atm.getAtmState().enterPin(atm, "1234", japleen);
        atm.getAtmState().selectOption(atm, japleen);
        atm.getAtmState().performTransaction(atm, japleen);

    }
}

