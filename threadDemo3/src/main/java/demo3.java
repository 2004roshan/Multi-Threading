public class demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Thread t1 = new Thread(
                ()->{
                    System.out.println("Name of the thread  is:"+Thread.currentThread().getName());
                    System.out.println("Id of the thread is:"+Thread.currentThread().getId());
                }
        );
        Thread t2 = new Thread(
                ()->{
                    System.out.println("Name of the 2nd thread  is:"+Thread.currentThread().getName());
                    System.out.println("Id of the 2nd thread is:"+Thread.currentThread().getId());
                }
        );
        t1.start();
        t2.start();
    }
}