public class demo {
    public static void main(String[] args) {
        bank b1 = new bank();
//        Thread t1 = new Thread(() -> b1.deposit());
//
//        Thread t2 = new Thread(() -> b1.withdraw());
        Thread t1 = new Thread(() -> b1.m1());

        Thread t2 = new Thread(() -> b1.m1());

        t1.start();
        t2.start();
    }
}
