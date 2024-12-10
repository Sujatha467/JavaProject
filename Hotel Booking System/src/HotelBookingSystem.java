import java.util.ArrayList;
import java.util.List;

public class HotelBookingSystem {
    private List<HotelRoom> rooms;

    public HotelBookingSystem(int totalRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= totalRooms; i++) {
            rooms.add(new StandardRoom(i));  // Using StandardRoom for now
        }
    }

    public void viewRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (HotelRoom room : rooms) {
            System.out.println(room);
        }
    }

    public void bookRoom(int roomNumber, String customerName) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).bookRoom(customerName);  // Calls overridden method
        } else {
            System.out.println("Invalid room number.");
        }
    }

    public void cancelRoomBooking(int roomNumber) {
        if (roomNumber > 0 && roomNumber <= rooms.size()) {
            rooms.get(roomNumber - 1).cancelBooking();  // Calls overridden method
        } else {
            System.out.println("Invalid room number.");
        }
    }
}