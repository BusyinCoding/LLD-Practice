public class User {
    Card userCard;
    BankAccount bankAccount;
    public User(Card userCard, BankAccount bankAccount)
    {
        this.userCard = userCard;
        this.bankAccount = bankAccount;
    }
    public Card getUserCard()
    {
        return this.userCard;
    }
    public BankAccount getBankAccount()
    {
        return bankAccount;
    }

}
