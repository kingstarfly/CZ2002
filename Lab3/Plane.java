import java.util.Arrays;

public class Plane {
    final int NUM_SEATS = 12;
    private PlaneSeat[] seats = new PlaneSeat[NUM_SEATS];
    private int numEmptySeats = 12;

    public Plane(){
        System.out.printf("New Plane created with %d empty seats\n", NUM_SEATS);
    };

    private PlaneSeat[] sortSeats(){
        // create a copy of the seat array and return the sorted array
        // sort asc order of customerId
        PlaneSeat[] seatsCopy = new PlaneSeat[seats.length];
        for (int i = 0; i<seats.length; i++){
            PlaneSeat seat = seats[i];
            if (seat != null) {
                seatsCopy[i] = new PlaneSeat(seat);
            }
        }
        // now we have a copy of seats called seatsCopy
        // sort seatsCopy because PlaneSeats implements Comparable interface.
        Arrays.sort(seatsCopy);
        return seatsCopy;
    }

    public void showNumEmptySeats() {
        System.out.println(this.numEmptySeats);
    }

    public void showEmptySeats() {
        System.out.printf("[");
        for (int i = 0; i < seats.length; i++){
            seats[i].
        }
    }

    public void showAssignedSeats(boolean bySeatId) {

    }
    
}