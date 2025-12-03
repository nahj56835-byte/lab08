package ocp2;

public class VipDiscount implements DiscountPolicy {
    @Override
    public double discount(double totalPrice) {
        return totalPrice * 0.25;
    }
}
