public class demo4 {
    public static void main(String[] args) {
        //print even no
        Thread t1 = new Thread(()-> {
            for (int i = 1; i <= 100; i++) {
                if(i % 2 == 0 ){
                    System.out.println("T1: "+i);
                }
            }
        });
        //print odd no
        Thread t2 = new Thread(()-> {
            for (int i = 1; i <= 100; i++) {
                if(i % 2 != 0 ){
                    System.out.println("T2: "+i);
                }
            }
        });
        t1.start();
        t2.start();
    }
}
