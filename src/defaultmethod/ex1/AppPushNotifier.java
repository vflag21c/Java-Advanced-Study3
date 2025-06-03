package defaultmethod.ex1;

public class AppPushNotifier implements Notifier{
    @Override
    public void notifier(String message) {
        System.out.println("[PUSH] : " + message);
    }
}
