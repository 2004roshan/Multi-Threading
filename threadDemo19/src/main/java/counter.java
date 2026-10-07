import java.util.concurrent.atomic.AtomicInteger;

// AtomicInteger
public class counter {
    //int count = 0
    AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // count++
    }
}
