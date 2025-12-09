package solid_project;
public class SmsNotifier implements Notifier {
    @Override public void notifyStudent(String studentId, String message) {
        System.out.println("SMS to " + studentId + ": " + message);
    }
}