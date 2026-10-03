import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private int value;

    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock rl = lock.readLock(); // Shared
    Lock wl = lock.writeLock(); // Exclusive

    public int read() {
        rl.lock();
        try {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
            System.out.println(Thread.currentThread().getName() + " Reads value: " + value);
            return value;
        } finally {
            rl.unlock();
        }
    }

    public void write(int newValue) {
        wl.lock();
        try{
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
            value = newValue;
            System.out.println(Thread.currentThread().getName() + "Changes value to " + newValue);
        }finally {
            wl.unlock();
        }
    }
}
