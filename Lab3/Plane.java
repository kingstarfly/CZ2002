import java.util.Arrays;

public class Plane {
    final int NUM_SEATS = 12;
    private PlaneSeat[] seats = new PlaneSeat[NUM_SEATS];
    private int numEmptySeats = 12;

    public Plane(){
        System.out.printf("New Plane created with %d empty seats\n", NUM_SEATS);

        // assign seat IDs
        for (int i = 0; i < seats.length; i++) {
            seats[i] = new PlaneSeat(i+1);
        }
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
        System.out.printf("Empty seats: %d\n\n", this.numEmptySeats);
    }

    public void showEmptySeats() {
        System.out.printf("Empty Seats: \n[");
        for (int i = 0; i < seats.length; i++){
            if (!seats[i].isOccupied()) {
                System.out.printf("%d ", seats[i].getSeatID());
            }
        }
        System.out.printf("]\n\n");
    }

    public void showAssignedSeats(boolean bySeatId) {
        if (bySeatId) {
            System.out.printf("Assigned Seats by seat ID: \n\n");
            System.out.printf("%-6s   %s", "Seat ID", "Customer ID\n");
            for (int i = 0; i < seats.length; i++){
                if (seats[i].isOccupied()) {
                    System.out.printf("%-6d %6d\n", seats[i].getSeatID(), seats[i].getCustomerID());
                }
            }
            System.out.printf("\n\n");
        } else {
            // sort by cust id before printing
            PlaneSeat[] sortedSeats = this.sortSeats();
            System.out.printf("Assigned Seats by customer ID: \n\n");
            System.out.printf("%-6s   %s", "Seat ID", "Customer ID\n");
            for (int i = 0; i < sortedSeats.length; i++){
                if (sortedSeats[i].isOccupied()) {
                    System.out.printf("%-6d %6d\n", sortedSeats[i].getSeatID(), sortedSeats[i].getCustomerID());
                }
            }
            System.out.printf("\n\n");
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        for (int i = 0; i < seats.length; i++){
            if (seats[i].getSeatID() == seatId) {
                if (seats[i].isOccupied()) {
                    System.out.printf("Error! Seat %d has already been assigned!\n", seatId);
                    return;
                }
                seats[i].assign(cust_id);
                numEmptySeats--;
            }
        }
        System.out.printf("Success! Seat ID %d has been successfully assigned Customer ID %d\n\n", seatId, cust_id);
    }

    public void unAssignSeat(int seatId) {
        for (int i = 0; i < seats.length; i++){
            if (seats[i].getSeatID() == seatId) {
                seats[i].unAssign();
                numEmptySeats++;
            }
        }
        System.out.printf("Success! Seat ID %d has been unassigned\n\n", seatId);
    }
    
}