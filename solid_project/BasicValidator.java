package solid_project;
public class BasicValidator implements EnrollmentValidator {
    @Override public boolean validate(EnrollmentRequest req) {
        return req.studentId != null && !req.studentId.isBlank()
            && req.courseId != null && !req.courseId.isBlank();
    }
    @Override public String reasonIfInvalid(EnrollmentRequest req) {
        return "studentId or courseId missing";
    }
}