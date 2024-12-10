import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelBookingSystem hotelSystem = new HotelBookingSystem(10); // 10 rooms

        while (true) {
            System.out.println("\n--- Hotel Booking System ---");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    hotelSystem.viewRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int bookRoomNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter your name: ");
                    String customerName = scanner.nextLine();
                    hotelSystem.bookRoom(bookRoomNumber, customerName);
                    break;
                case 3:
                    System.out.print("Enter room number to cancel booking: ");
                    int cancelRoomNumber = scanner.nextInt();
                    hotelSystem.cancelRoomBooking(cancelRoomNumber);
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Booking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}