public abstract class CashWithDrawProcessor {

    CashWithDrawProcessor nextCashWithDrawProcessor;
    CashWithDrawProcessor(CashWithDrawProcessor cashWithDrawProcessor)
    {
        this.nextCashWithDrawProcessor = cashWithDrawProcessor;
    }

    public void withDrawCash(ATM atm, double amount)
    {
        if(nextCashWithDrawProcessor != null)
        {
            nextCashWithDrawProcessor.withDrawCash(atm, amount);
        }
    }



}
