public class TwoThousandCashWithDrawProcessor extends CashWithDrawProcessor{


    TwoThousandCashWithDrawProcessor(CashWithDrawProcessor cashWithDrawProcessor) {
        super(cashWithDrawProcessor);
    }
    @Override
    public void withDrawCash(ATM atm, double amount)
    {
        int twoThousandNoteRequired = (int) amount/2000;
        int remaining = (int) amount%2000;
        if(twoThousandNoteRequired <= atm.getTwoThousandCount())
        {
            System.out.println("Dispensing "+ twoThousandNoteRequired + " 2000 notes");
            atm.deductAmount(twoThousandNoteRequired * 2000);
            amount = remaining;
        }
        else
        {
            int availableTwoThousandNotes = atm.getTwoThousandCount();
            System.out.println("Dispensing "+ availableTwoThousandNotes + " 2000 notes");
            atm.deductAmount(availableTwoThousandNotes * 2000);
            amount = amount - (availableTwoThousandNotes * 2000);
        }
        if(amount != 0)
        {
            super.withDrawCash(atm, amount);
        }

    }
}
