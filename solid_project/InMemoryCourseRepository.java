package solid_project;
import java.util.Map;
import java.util.HashMap;
public class InMemoryCourseRepository implements CourseRepository {
    private final Map<String, Integer> slots = new HashMap<>();

    public InMemoryCourseRepository(Map<String, Integer> initial) {
        slots.putAll(initial);
    }

    @Override
    public int getRemainingSlots(String courseId) {
        return slots.getOrDefault(courseId, 0);
    }

    @Override
    public void reduceSlot(String courseId, int n) {
        slots.put(courseId, getRemainingSlots(courseId) - n);
    }
}
