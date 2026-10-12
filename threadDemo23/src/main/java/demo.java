import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Number of task = 5
        for (int i=1; i<=5; i++){
            int TaskId = i;

            executor.execute(() ->{
                System.out.println("Task " + TaskId + " is performed by " +
                        Thread.currentThread().getName());
            });
        }
        
        executor.shutdown();
    }
}
