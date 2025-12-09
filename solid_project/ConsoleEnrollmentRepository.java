package solid_project;
public class ConsoleEnrollmentRepository implements EnrollmentRepository {
    @Override public void save(EnrollmentRequest req) {
        System.out.println("Saved enrollment: " + req.studentId + " -> " + req.courseId);
    }
}