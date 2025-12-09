package solid_project;
public class EmailNotifier implements Notifier {
    @Override public void notifyStudent(String studentId, String message) {
        System.out.println("Email to " + studentId + ": " + message);
    }
}