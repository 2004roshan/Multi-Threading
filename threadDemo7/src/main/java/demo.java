public class demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");

        Thread t1 = new Thread(()->{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println("Thread-0 starts");
        });

        t1.start();

        t1.join(1000);  //Let the t1 thread first complete its execution

        System.out.println("Main thread end");
    }
}
