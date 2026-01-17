import java.util.List;
import java.util.UUID;

public class Booking {

    UUID bookingId;
    User user;
    Show show;
    List<Integer> seats;
    Payment payment;

    public Booking(User user, Show show, List<Integer> seats, Payment payment) {
        this.bookingId = UUID.randomUUID();
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.payment = payment;
    }

    public UUID getBookingId() {
        return bookingId;
    }

}
