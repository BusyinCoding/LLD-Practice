public class FiveHundredCashWithDrawProcessor extends CashWithDrawProcessor{


    FiveHundredCashWithDrawProcessor(CashWithDrawProcessor cashWithDrawProcessor) {
        super(cashWithDrawProcessor);
    }
    @Override
    public void withDrawCash(ATM atm, double amount)
    {
        int fiveHundredNoteRequired = (int) amount/500;
        int remaining = (int) amount%500;
        if(fiveHundredNoteRequired <= atm.getFiveHundredCount())
        {
            System.out.println("Dispensing "+ fiveHundredNoteRequired + " 500 notes");
            atm.deductAmount(fiveHundredNoteRequired * 500);
            amount = remaining;
        }
        else
        {
            int availableFiveHundredNotes = atm.getFiveHundredCount();
            System.out.println("Dispensing "+ availableFiveHundredNotes + " 500 notes");
            atm.deductAmount(availableFiveHundredNotes * 500);
            amount = amount - (availableFiveHundredNotes * 500);
        }
        if(amount != 0)
        {
            super.withDrawCash(atm, amount);
        }

    }
}
