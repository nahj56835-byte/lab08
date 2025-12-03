package srp2;

import java.util.List;

public class CourseReportManager {

    private CourseDataLoader loader = new CourseDataLoader();
    private GradeCalculator calculator = new GradeCalculator();
    private ReportFormatter formatter = new ReportFormatter();
    private ReportStorage storage = new ReportStorage();
    private TeacherNotifier notifier = new TeacherNotifier();

    public void generateReport(String courseId) {

        List<String> students = loader.loadStudents(courseId);
        List<Integer> grades = loader.loadGrades(courseId);

        double avg = calculator.calculateAverage(grades);

        String report = formatter.format(courseId, students, grades, avg);

        storage.save(report);

        notifier.notify(report);
    }
}
