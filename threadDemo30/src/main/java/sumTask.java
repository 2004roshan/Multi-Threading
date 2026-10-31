import java.util.concurrent.RecursiveTask;

public class sumTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start;
    private int end;

    public sumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // Base condition
        if((end-start) <=2){
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum+=arr[i];
            }
            return sum;
        }

        // main logic --> fork
        int mid = (start+end)/2;
        sumTask leftTask = new sumTask(arr, start, mid);
        sumTask rightTask = new sumTask(arr, mid+1, end);

        leftTask.fork();
        int sum2 = rightTask.compute();

        int sum1 = leftTask.join();

        // Join
        return sum2 + sum1;
    }
}
