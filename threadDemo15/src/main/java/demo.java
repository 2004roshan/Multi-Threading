public class demo {
    public static void main(String[] args) {
        box b1 = new box();

        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 20; i++) {
                try{
                    Thread.sleep(100);
                    b1.producer(i);
                }catch (Exception e){}
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 1; i <= 20; i++) {
                try{
                    Thread.sleep(70);
                    b1.consumer();
                }catch (Exception e){}
            }
        });

        t1.start();
        t2.start();
    }
}
