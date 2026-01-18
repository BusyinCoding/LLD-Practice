public enum TransactionType {
    CHECK_BALANCE,
    WITHDRAW;

    public static void showTransactionOptions() {
        for (TransactionType type : TransactionType.values()) {
            System.out.println("- " + type);
        }
    }

}
