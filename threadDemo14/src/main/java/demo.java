public class demo {
    public static void main(String[] args) {
        box b1 = new box();

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 20; i++) {
                try{
                    Thread.sleep(100);
                }catch (Exception e){}
                b1.producer(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 20; i++) {
                try{
                    Thread.sleep(70);
                }catch (Exception e){}
                b1.consumer();
            }
        });

        t1.start();
        t2.start();
    }
}
