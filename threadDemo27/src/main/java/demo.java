import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class demo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        for(int i=0;i<5;i++) {
            int taskid = i;
            scheduler.schedule(() -> {
                System.out.println("Task " + taskid + " is performed by "
                        + Thread.currentThread().getName());
            }, 2, java.util.concurrent.TimeUnit.SECONDS);
        }

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task is performed by " + Thread.currentThread().getName());
        }, 0, 2, java.util.concurrent.TimeUnit.SECONDS);

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){};
        scheduler.shutdown();
    }
}
