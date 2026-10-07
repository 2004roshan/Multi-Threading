public class demo {
    public static void main(String[] args) {
        counter counter = new counter();
        Thread t1 = new Thread(() ->{
            for(int i=1; i<=10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i=1; i<=10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println("Count is: " + counter.count);
    }
}
