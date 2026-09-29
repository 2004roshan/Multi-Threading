public class demo {
    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();

        Thread t1 = new Thread(() -> {
            c1.increment();
        });

        Thread t2 = new Thread(() -> {
            c2.increment();
        });

        t1.start();
        t2.start();
    }
}
