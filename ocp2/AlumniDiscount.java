package ocp2;

public class AlumniDiscount implements DiscountPolicy {
    @Override
    public double discount(double totalPrice) {
        return totalPrice * 0.10;
    }
}
