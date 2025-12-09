package solid_project;

import java.util.List;
import java.util.Map;

public class MainProject {
    public static void main(String[] args) {
        // course slots
        InMemoryCourseRepository courseRepo = new InMemoryCourseRepository(
            Map.of("CS101", 2, "CS102", 0)
        );

        EnrollmentValidator basic = new BasicValidator();
        EnrollmentValidator max = new MaxSizeValidator(courseRepo);

        EnrollmentRepository repo = new ConsoleEnrollmentRepository();
        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();

        EnrollmentService service = new EnrollmentService(
            List.of(basic, max),
            repo,
            List.of(email, sms),
            courseRepo
        );

        service.enroll(new EnrollmentRequest("s1", "CS101")); // success, CS101 -> 1
        service.enroll(new EnrollmentRequest("s2", "CS101")); // success, CS101 -> 0
        service.enroll(new EnrollmentRequest("s3", "CS101")); // fail: Course full
        service.enroll(new EnrollmentRequest("s4", "CS102")); // fail: Course full (0)
    }
}
