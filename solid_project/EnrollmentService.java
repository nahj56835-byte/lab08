package solid_project;

import java.util.List;

public class EnrollmentService {
    private final List<EnrollmentValidator> validators;
    private final EnrollmentRepository repository;
    private final List<Notifier> notifiers;
    private final CourseRepository courseRepo;

    public EnrollmentService(List<EnrollmentValidator> validators,
                             EnrollmentRepository repository,
                             List<Notifier> notifiers,
                             CourseRepository courseRepo) {
        this.validators = validators;
        this.repository = repository;
        this.notifiers = notifiers;
        this.courseRepo = courseRepo;
    }

    public boolean enroll(EnrollmentRequest req) {

        // 1) validation
        for (EnrollmentValidator v : validators) {
            if (!v.validate(req)) {

                // ⬇️ LẤY LÝ DO MỘT LẦN DUY NHẤT
                String reason = v.reasonIfInvalid(req);

                System.out.println("Enrollment failed: " + reason);

                // notify fail
                for (Notifier n : notifiers) {
                    n.notifyStudent(req.studentId, "Enrollment failed: " + reason);
                }

                return false;
            }
        }

        // 2) save enrollment
        repository.save(req);

        // 3) reduce slot
        courseRepo.reduceSlot(req.courseId, 1);

        // 4) notify success
        String msg = "You have been enrolled in " + req.courseId;
        for (Notifier n : notifiers) {
            n.notifyStudent(req.studentId, msg);
        }

        return true;
    }
}
