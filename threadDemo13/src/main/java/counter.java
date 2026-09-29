public class counter {
    static int count=0;
    static void increment() {
        synchronized (counter.class) {
            try{
                Thread.sleep(2000);
            }catch(Exception e){}
            count++;
            System.out.println("Count: " + count);
        }
    }
}
