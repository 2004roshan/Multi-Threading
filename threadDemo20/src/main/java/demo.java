public class demo {
    public static void main(String[] args) {
        seatBooking sb =  new seatBooking();

        Thread t1 = new Thread(() -> {
            boolean result1=sb.bookSeat("Rahul");
            System.out.println("Rahul seat is booked:"+result1);
        });
        Thread t2 = new Thread(() -> {
            boolean result2=sb.bookSeat("Roshan");
            System.out.println("Roshan seat is booked:"+result2);
        });

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){};

        System.out.println(sb.seat);
    }
}
