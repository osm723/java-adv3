package defaultMethod.ex2;

import java.time.LocalDateTime;

public class EmailNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("[EMAIL] = " + message);
    }

    @Override
    public void scheduleNotification(String message, LocalDateTime time) {
        System.out.println("[EMAIL 전용 스케줄링 ] = " + message + " time: " + time);
    }
}
