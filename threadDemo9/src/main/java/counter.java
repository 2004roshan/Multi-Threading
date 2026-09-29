public class counter {
    public int count;

    public synchronized void increment(){
        count++;
    }
}
