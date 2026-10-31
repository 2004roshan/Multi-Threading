import java.util.concurrent.ForkJoinPool;

public class demo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        ForkJoinPool pool = new ForkJoinPool();
        sumTask Task = new sumTask(arr, 0, arr.length-1);
        int result = pool.invoke(Task);

        System.out.println(result);

        pool.shutdown();
    }
}
