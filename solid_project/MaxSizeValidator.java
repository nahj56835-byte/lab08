package solid_project;

public class MaxSizeValidator implements EnrollmentValidator {
    private final CourseRepository courseRepo;

    public MaxSizeValidator(CourseRepository courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public boolean validate(EnrollmentRequest req) {
        return courseRepo.getRemainingSlots(req.courseId) > 0;
    }

    @Override
    public String reasonIfInvalid(EnrollmentRequest req) {
        return "Course full";
    }
}
