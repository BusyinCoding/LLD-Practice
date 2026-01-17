public class Seat {

     int seatId;
     SeatCategory seatCategory;
    public Seat(int seat, SeatCategory seatCategory){
        this.seatId = seat;
        this.seatCategory = seatCategory;
    }
    public int getSeatId() {
        return seatId;
    }
}
