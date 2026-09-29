public class box {
    volatile Integer item;
    volatile boolean flag = false;

    synchronized void producer(int value) throws InterruptedException {
        while(flag == true){
            wait();
        }
        item = value;
        flag = true;
        System.out.println("Produced produces " + item);
        notify();
    }
    synchronized void consumer() throws InterruptedException {
        while(flag == false){
            wait();
        }
        System.out.println("Consumed consumes " + item);
        item = null;
        flag = false;
        notify();
    }
}