package dip2;

public class CheckoutService {
    private final PaymentMethod paymentMethod;
    public CheckoutService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void checkout(double amount) {
    // some logic...
    paymentMethod.pay(amount);
    }
}
