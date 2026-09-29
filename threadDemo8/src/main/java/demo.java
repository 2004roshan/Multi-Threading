public class demo {
    static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            flag=true;
        });
        Thread t2 = new Thread(() -> {
            while(!flag){
                //System.out.println("Thread 2 is Running.."); // synchronized
                // this method do nothing
            }
            System.out.println("Thread 2 is Finished.");
        });

        t1.start();
        t2.start();
    }
}
