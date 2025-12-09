package solid_project;

public interface CourseRepository {
    int getRemainingSlots(String courseId);
    void reduceSlot(String courseId, int n);
}
