package defaultmethod.ex1;

public class SMSNotifier implements Notifier{
    @Override
    public void notifier(String message) {
        System.out.println("[SMS] : " + message);
    }
}
