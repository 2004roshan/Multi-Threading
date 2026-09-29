public class demo2 {
    public static void main(String[] args) {
        //myRunnable myRunnable = new myRunnable();
        Thread t1 = new Thread(()-> System.out.println("Thread is running"));
        t1.start();
    }
}
