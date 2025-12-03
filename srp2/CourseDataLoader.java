package srp2;

import java.util.List;

public class CourseDataLoader {
    public List<String> loadStudents(String courseId) {
        System.out.println("Connecting to database...");
        System.out.println("Loading students for course " + courseId + "...");
        return List.of("An", "Binh", "Chi");
    }

    public List<Integer> loadGrades(String courseId) {
        return List.of(9, 7, 8);
    }
}
