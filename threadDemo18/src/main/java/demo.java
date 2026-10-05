public class demo {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Thread r1 = new Thread(() -> sr.read());
        Thread r2 = new Thread(() -> sr.read());
        Thread r3 = new Thread(() -> sr.read());

        Thread w1 = new Thread(() -> sr.write(5));
        Thread w2 = new Thread(() -> sr.write(6));
        Thread w3 = new Thread(() -> sr.write(9));

        r1.start();
        r2.start();
        r3.start();
        
        w1.start();
        w2.start();
        w3.start();
    }
}
