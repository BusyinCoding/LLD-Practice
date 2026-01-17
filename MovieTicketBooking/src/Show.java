import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Show {

    Movie movie;
    LocalDate showDate;
    LocalTime startTime;
    final Map<Integer, SeatStatus> seatStatusMap = new HashMap<>();
    Map<Integer, ReentrantLock> seatLocks = new HashMap<>();

    public Show(Movie movie, Screen screen, LocalDate showDate, LocalTime startTime) {
        this.movie = movie;
        this.showDate = showDate;
        this.startTime = startTime;
        for (Seat seat : screen.getSeats()) {
            seatStatusMap.put(seat.getSeatId(), SeatStatus.AVAILABLE);
            seatLocks.put(seat.getSeatId(), new ReentrantLock());
        }
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void releaseSeat(List<Integer> seatNumbers) {
        for (Integer seatNumber : seatNumbers) {
            seatStatusMap.put(seatNumber, SeatStatus.AVAILABLE);
        }
    }

    public void bookSeat(List<Integer> seatNumbers) {
        for (Integer seatNumber : seatNumbers) {
            seatStatusMap.put(seatNumber, SeatStatus.BOOKED);
        }
    }

    public void lockSeat(List<Integer> seatNumbers) {
        for (Integer seatNumber : seatNumbers) {
            seatStatusMap.put(seatNumber, SeatStatus.LOCKED);
        }
    }

    public boolean lockSeats(List<Integer> seatIds) {
        List<Integer> sorted = new ArrayList<>(seatIds);
        Collections.sort(sorted);
        List<ReentrantLock> acquiredLocks = new ArrayList<>();
        try {
            for (int seatId : sorted) {
                ReentrantLock lock = seatLocks.get(seatId);
                lock.lock();
                acquiredLocks.add(lock);
            }
            for (int seatId : seatIds) {
                if (seatStatusMap.get(seatId) != SeatStatus.AVAILABLE) {
                    return false;
                }
            }
            for (int seatId : seatIds) {
                seatStatusMap.put(seatId, SeatStatus.LOCKED);
            }
            return true;
        } finally {
            for (ReentrantLock lock : acquiredLocks) {
                lock.unlock();
            }
        }
    }


}
