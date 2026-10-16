import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {
    public static void main(String[] args) {
        ExecutorService executor1 = Executors.newCachedThreadPool();

        for(int i=1; i<=10; i++){
            int taskId=i;
            executor1.execute(()->{
                System.out.println("Task " + taskId + " is running in thread " +
                        Thread.currentThread().getName());
            });
        }

        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        for(int i=1; i<=10; i++){
            int taskId=i;
            executor2.execute(()->{
                System.out.println("Task " + taskId + " is running in thread " +
                        Thread.currentThread().getName());
            });
        }

        executor1.shutdown();
        executor2.shutdown();
    }
}
