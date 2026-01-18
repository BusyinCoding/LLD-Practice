public class ATM {
    ATMState atmState;
    double amountAvailable;
    int twoThousandCount;
    int fiveHundredCount;
    int twoHundredCount;
    int hundredCount;

    public void setCurrentState(ATMState state)
    {
        this.atmState = state;
    }
    public void intialize()
    {
        setCurrentState(new IdleState());
    }

    public void addMoney(double amount, int twoThousandCount, int fiveHundredCount, int twoHundredCount, int hundredCount)
    {
        this.amountAvailable = amount;
        this.twoThousandCount = twoThousandCount;
        this.fiveHundredCount = fiveHundredCount;
        this.twoHundredCount = twoHundredCount;
        this.hundredCount = hundredCount;
    }
    public double getAmountAvailable()
    {
        return amountAvailable;
    }

    public void deductAmount(double amount)
    {
        amountAvailable -= amount;
    }
    public int getTwoThousandCount() {
        return twoThousandCount;
    }
    public int getFiveHundredCount() {
        return fiveHundredCount;
    }
    public int getTwoHundredCount() {
        return twoHundredCount;
    }
    public int getHundredCount() {
        return hundredCount;
    }
    public ATMState getAtmState() {
        return atmState;
    }


}
