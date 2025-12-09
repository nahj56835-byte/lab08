package dip2;
public class MainDIP {
    public static void main(String[] args) {
        CheckoutService s1 = new CheckoutService(new PaypalPayment());
        CheckoutService s2 = new CheckoutService(new CreditCardPayment());
        CheckoutService s3 = new CheckoutService(new CashPayment());
        s1.checkout(100);
        s2.checkout(200);
        s3.checkout(50);
    }
}