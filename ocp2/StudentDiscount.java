package ocp2;

public class StudentDiscount implements DiscountPolicy {
    @Override
    public double discount(double totalPrice) {
        return totalPrice * 0.15;
    }
}
