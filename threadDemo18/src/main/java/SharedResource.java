import java.util.concurrent.locks.StampedLock;

public class  SharedResource {
    private int value = 0;

    StampedLock lock = new StampedLock();

    public int read() {
        long stamp = lock.tryOptimisticRead();

        int currentValue = value;
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {}

        if(lock.validate(stamp) == false){
            //fallover logic
            //try pessimistic read
            stamp = lock.readLock();
            try {
                currentValue = value;
            }
            finally {
                lock.unlockRead(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName() + " reads value as " + currentValue);
        return currentValue;
    }

    public void write(int newValue) {
        long stamp =lock.writeLock();
        try{
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
            value = newValue;
            System.out.println(Thread.currentThread().getName() + "Changes value to " + newValue);
        }finally {
            lock.unlock(stamp);
        }
    }
}
