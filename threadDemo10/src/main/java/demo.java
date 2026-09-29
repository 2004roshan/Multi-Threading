public class demo {
    public static void main(String[] args) {
        test test = new test();
        Thread t1 = new Thread(() -> test.m1());

        Thread t2 = new Thread(() -> test.m2());

        t1.start();
        t2.start();
    }
}

class test{
     static void m1(){
         synchronized (test.class){
             System.out.println("m1 entered..");
             try {
                 Thread.sleep(2000);
             }catch (Exception e){}
             System.out.println("m1 exiting..");
         }
    }

     void m2(){
         synchronized (this){
             System.out.println("m2 entered..");
             try {
                 Thread.sleep(2000);
             }catch (Exception e){}
             System.out.println("m2 exiting..");
         }
    }
}