import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int seatId;
        int custId;
        while (choice != 7) {
            System.out.printf("============\nPlease Select an option (1-7)\n1. Show the number of empty seats\n2. Show the list of empty seats\n3. Show the list of customers together with their seat numbers in the order of the seat numbers\n4. Show the list of customers together with their seat numbers in the order of the customer ID\n5. Assign a customer to a seat\n6. Remove a seat assignment\n7. Quit\n============\n\n>> ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Show number of empty seats
                    p1.showNumEmptySeats();;                    
                    break;
                case 2:
                    // Show list of empty seats
                    p1.showEmptySeats();
                    break;
                case 3:
                    // Show list of custs tgt with seat numbers, in order of seat ID.
                    p1.showAssignedSeats(true);
                    break;
                case 4:
                    // in order of customer ID.
                    p1.showAssignedSeats(false);
                    break;
                case 5:
                    // assign cust to seat
                    System.out.printf("Enter Seat ID to assign: ");
                    seatId = sc.nextInt();
                    System.out.printf("Enter Customer ID to assign: ");
                    custId = sc.nextInt();
                    p1.assignSeat(seatId, custId);
                    break;

                case 6:
                    System.out.println("Enter Seat ID to remove: ");
                    seatId = sc.nextInt();
                    p1.unAssignSeat(seatId);
                
                default:
                    break;
            }
        }
        sc.close();
    }
}