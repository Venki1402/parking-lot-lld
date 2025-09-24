import java.time.LocalDateTime;

public class Payment {
    private final String paymentId;
    private final double amount;
    private final PaymentMode mode;
    private final LocalDateTime paymentTime;

    public Payment(String paymentId, double amount, PaymentMode mode) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.mode = mode;
        this.paymentTime = LocalDateTime.now();
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }
}