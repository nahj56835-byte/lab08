package ocp2;

import java.util.Map;

public class DiscountService {

    private final Map<String, DiscountPolicy> policies;

    public DiscountService(Map<String, DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double calculateDiscount(String userType, double totalPrice) {
        DiscountPolicy p = policies.getOrDefault(userType, price -> 0.0);
        return p.discount(totalPrice);
    }
}
