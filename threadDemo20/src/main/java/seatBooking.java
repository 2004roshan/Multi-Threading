public class seatBooking {
    String seat = new String("EMPTY");

    boolean bookSeat(String name) {
        if(seat.equals("EMPTY")) {
            seat = new  String(name);
            return true;
        }
        return false;
    }
}
