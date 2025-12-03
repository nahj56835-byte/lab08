package ocp2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, DiscountPolicy> policies = Map.of(
                "STUDENT", new StudentDiscount(),
                "TEACHER", new TeacherDiscount(),
                "VIP", new VipDiscount(),
                "ALUMNI", new AlumniDiscount()
        );

        DiscountService service = new DiscountService(policies);

        System.out.println(service.calculateDiscount("STUDENT", 100)); // 15
        System.out.println(service.calculateDiscount("VIP", 100));     // 25
        System.out.println(service.calculateDiscount("ALUMNI", 100));  // 10
    }
}
