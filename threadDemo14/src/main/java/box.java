public class box {
    volatile Integer item;
    volatile boolean flag = false;

    synchronized void producer(int value){
        while(flag == true){
            //do nothing
        }
        item = value;
        flag = true;
        System.out.println("Produced produces " + item);
    }
    synchronized void consumer(){
        while(flag == false){
            //do nothing
        }
        System.out.println("Consumed consumes " + item);
        item = null;
        flag = false;

    }
}