package optional.logger;

import java.util.function.Supplier;

public class Logger {
    private boolean isDebug = false;

    public boolean isDebug() {
        return isDebug;
    }

    public void setDebug(boolean isDebug) {
        this.isDebug = isDebug;
    }

    public void debug(Object message) {
        if (isDebug) {
            System.out.println("[DEBUG] " + message);
        }
    }

    // 추가
    // 람다를 받아서 실행
    public void debug(Supplier<?> supplier) {
        if (isDebug) {
            System.out.println("[DEBUG] " + supplier.get());
        }
    }
}
