package solid_project;
public interface EnrollmentValidator {
    boolean validate(EnrollmentRequest req);
    String reasonIfInvalid(EnrollmentRequest req);
}