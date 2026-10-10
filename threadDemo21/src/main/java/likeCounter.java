import java.util.concurrent.atomic.AtomicReference;

public class likeCounter {
    AtomicReference<Integer> totalCount=new AtomicReference<>(0);

    public void like(){
        Integer currentCount;
        Integer finalCount;

        while(true){
            // 1. we will capture the latest value of totalCount
            currentCount=totalCount.get();

            // 2. Increment like counter by 1
            finalCount=currentCount+1;

            // 3. Check again, if the count is still what i saw
            if(totalCount.compareAndSet(currentCount,finalCount)){
                return;
            }

            // If thread reaches here, someone else must have updated the count
            // so we will retry the whole process again
            System.out.println("Conflict detected, retrying...");

        }
    }

    public int getTotalLikes(){
       return totalCount.get();
    }
}
