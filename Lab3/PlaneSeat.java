public class PlaneSeat implements Comparable<PlaneSeat> {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int seatId) {
        this.seatId = seatId;
    }

    // copy constructor
    public PlaneSeat(PlaneSeat seat) {
        this.seatId = seat.seatId;
        this.assigned = seat.assigned;
        this.customerId = seat.customerId;
    }

    public int getSeatID() {
        return this.seatId;
    }

    public int getCustomerID() {
        return this.customerId;
    }

    public boolean isOccupied() {
        return this.assigned;
    }

    public void assign(int custId) {
        this.customerId = custId;
        this.assigned = true;
    }

    public void unAssign() {
        this.assigned = false;
    }

    @Override
    public int compareTo(PlaneSeat o) {
        // compare based on customerId
        return this.customerId - o.customerId; // this way for asc
    }
}