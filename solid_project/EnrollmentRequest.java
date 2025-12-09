package solid_project;
public class EnrollmentRequest {
    public final String studentId;
    public final String courseId;
    public EnrollmentRequest(String studentId, String courseId) {
        this.studentId = studentId; this.courseId = courseId;
    }
}