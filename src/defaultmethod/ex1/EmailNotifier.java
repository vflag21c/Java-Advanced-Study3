package defaultmethod.ex1;

public class EmailNotifier implements Notifier{

    @Override
    public void notifier(String message) {
        System.out.println("[EMAIL] : " + message);
    }
}
