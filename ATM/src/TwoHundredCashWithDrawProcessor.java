public class TwoHundredCashWithDrawProcessor extends CashWithDrawProcessor{


    TwoHundredCashWithDrawProcessor(CashWithDrawProcessor cashWithDrawProcessor) {
        super(cashWithDrawProcessor);
    }
    @Override
    public void withDrawCash(ATM atm, double amount)
    {
        int twoHundredNoteRequired = (int) amount/200;
        int remaining = (int) amount%200;
        if(twoHundredNoteRequired <= atm.getTwoHundredCount())
        {
            System.out.println("Dispensing "+ twoHundredNoteRequired + " 200 notes");
            atm.deductAmount(twoHundredNoteRequired * 200);
            amount = remaining;
        }
        else
        {
            int available = atm.getTwoHundredCount();
            System.out.println("Dispensing "+ available + " 200 notes");
            atm.deductAmount(available * 200);
            amount = amount - (available * 200);
        }
        if(amount != 0)
        {
            super.withDrawCash(atm, amount);
        }

    }
}
