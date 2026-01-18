public class HundredCashWithDrawProcessor extends CashWithDrawProcessor{


    HundredCashWithDrawProcessor(CashWithDrawProcessor cashWithDrawProcessor) {
        super(cashWithDrawProcessor);
    }
    @Override
    public void withDrawCash(ATM atm, double amount)
    {
        int hundredNoteRequired = (int) amount/100;
        int remaining = (int) amount%100;
        if(hundredNoteRequired <= atm.getHundredCount())
        {
            System.out.println("Dispensing "+ hundredNoteRequired + " 100 notes");
            atm.deductAmount(hundredNoteRequired * 100);
            amount = remaining;
        }
        else
        {
            int available = atm.getHundredCount();
            System.out.println("Dispensing "+ available + " 100 notes");
            atm.deductAmount(available * 100);
            amount = amount - (available * 100);
        }
        if(amount != 0)
        {
            super.withDrawCash(atm, amount);
        }

    }
}
