package srp2;

import java.util.List;

public class ReportFormatter {
    public String format(String courseId, List<String> students, List<Integer> grades, double avg) {
        StringBuilder report = new StringBuilder();
        report.append("Course ID: ").append(courseId).append("\n");
        report.append("Students and grades:\n");
        for (int i = 0; i < students.size(); i++) {
            report.append("- ").append(students.get(i))
                  .append(": ").append(grades.get(i)).append("\n");
        }
        report.append("Average grade: ").append(avg).append("\n");
        return report.toString();
    }
}
