import java.util.concurrent.atomic.AtomicReference;

public class seatBooking {
    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean bookSeat(String name) {
        String currentValue = seat.get();

        if(currentValue.equals("EMPTY") == false) {
            return false;
        }
        return seat.compareAndSet("EMPTY", name);
    }
}
