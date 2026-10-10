public class demo {
    public static void main(String[] args) {
        likeCounter lk = new likeCounter();

        Thread t1 = new Thread(() -> {
            for(int i=1;i<=10;i++){
                lk.like();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=1;i<=10;i++){
                lk.like();
            }
        });
        Thread t3 = new Thread(() -> {
            for(int i=1;i<=10;i++){
                lk.like();
            }
        });
        Thread t4 = new Thread(() -> {
            for(int i=1;i<=10;i++){
                lk.like();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            Thread.sleep(3000);
        }catch (Exception e){}

        System.out.println("total count: " + lk.getTotalLikes());

    }
}
