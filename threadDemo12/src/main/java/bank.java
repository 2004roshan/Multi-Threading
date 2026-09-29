public class bank {
    Object lock1 = new Object();
    Object lock2 = new Object();

    void m1(){
        synchronized (new Object()){
            System.out.println(Thread.currentThread().getName() + "Entered m1");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println(Thread.currentThread().getName() + "Exited m1");
        }
    }

    void deposit(){
        synchronized (lock1){
            System.out.println("Deposit Logic");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }

    void withdraw(){
        synchronized (lock2){
            System.out.println("Withdraw Logic");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        }
    }
}