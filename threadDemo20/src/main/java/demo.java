public class demo {
    public static void main(String[] args) {
        seatBooking sb =  new seatBooking();

        Thread t1 = new Thread(() -> sb.bookSeat("Rahul"));
        Thread t2 = new Thread(() -> sb.bookSeat("Roshan"));

        t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){};

        System.out.println(sb.seat);
    }
}
