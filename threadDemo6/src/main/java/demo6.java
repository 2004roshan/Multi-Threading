public class demo6 {
    public static void main(String[] args) {
        Thread mainThread= Thread.currentThread(); // taking the reference of main thread
        // thread new state
        Thread t1 = new Thread(()-> {
            System.out.println("Name of the current thread: " + Thread.currentThread().getName());
            System.out.println("Main thread state: " + mainThread.getState());
        });
        System.out.println(t1.getState());

        //Runnable Stage
        t1.start();
        System.out.println(t1.getState());// Runnable

        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println(t1.getState());
    }
}
