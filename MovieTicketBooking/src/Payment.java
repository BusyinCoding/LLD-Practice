public class Payment {

    PaymentEnum paymentStatus;
    public Payment(PaymentEnum paymentStatus){
        this.paymentStatus = paymentStatus;
    }
    public PaymentEnum getPaymentStatus() {
        return paymentStatus;
    }
}
