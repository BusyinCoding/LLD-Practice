public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deductAmount(double amount)
    {
        this.balance -= amount;
    }

}
