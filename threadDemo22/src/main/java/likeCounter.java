import java.util.concurrent.atomic.AtomicInteger;

public class likeCounter {
    AtomicInteger totalCount = new AtomicInteger(0);

    public void like(){
        totalCount.incrementAndGet();
    }

    public int getTotalLikes(){
       return totalCount.get();
    }
}
