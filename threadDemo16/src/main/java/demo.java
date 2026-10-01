public class demo {
    public static void main(String[] args) {
        Resource r1 = new Resource();

        Thread t1 = new Thread(() -> r1.f1());

        Thread t2 = new Thread(() -> r1.f1());

        Thread t3 = new Thread(() -> r1.f1());

        t1.start();
        t2.start();
        t3.start();
    }
}
