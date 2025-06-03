package defaultmethod.ex2;

import java.time.LocalDateTime;

public class EmailNotifier implements Notifier {

    @Override
    public void notifier(String message) {
        System.out.println("[EMAIL] : " + message);
    }

    @Override
    public void scheduleNotification(String message, LocalDateTime scheduleTime) {
        System.out.println("[EMAIL 전용 스케줄링] + " + scheduleTime + " : " + message);
    }
}
