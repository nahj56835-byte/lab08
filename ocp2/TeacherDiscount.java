package ocp2;

public class TeacherDiscount implements DiscountPolicy {
    @Override
    public double discount(double totalPrice) {
        return totalPrice * 0.20;
    }
}
