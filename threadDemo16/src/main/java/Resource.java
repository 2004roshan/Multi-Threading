import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
    Lock lock = new ReentrantLock();

    void f1(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " entered");

            try{
                Thread.sleep(1000);
            }catch (Exception e){}

            System.out.println(Thread.currentThread().getName() + " exited");
        }
        finally {
            lock.unlock();
        }
    }
}