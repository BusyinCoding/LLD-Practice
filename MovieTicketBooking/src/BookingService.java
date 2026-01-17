import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BookingService {

    Map<UUID, Booking> bookings;

    public UUID createBooking(User u, Show s, List<Integer> seats) {
        if (!s.lockSeats(seats)) {
            throw new RuntimeException("Seat unavailable");
        }
        Payment payment = new Payment(PaymentEnum.SUCCESS);
        if (payment.getPaymentStatus() != PaymentEnum.SUCCESS) {
            s.releaseSeat(seats);
            throw new RuntimeException("Payment failed");
        } else {
            s.bookSeat(seats);
            Booking booking = new Booking(u, s, seats, payment);
            bookings.put(booking.getBookingId(), booking);
            return booking.getBookingId();
        }
    }

    public Booking getBooking(UUID bookingId) {
        return bookings.get(bookingId);
    }

    public List<Booking> getBookingForUser(User user) {
        return bookings.values().stream().filter(b -> b.user.equals(user)).toList();
    }


    public void cancelBooking(int bookingId) {
        //find booking by id
        //initiate refund
        //update seat status
        //confirm cancellation
    }

}
