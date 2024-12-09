public class StandardRoom extends HotelRoom {
    public StandardRoom(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public void bookRoom(String customerName) {
        if (isAvailable) {
            this.isAvailable = false;
            this.customerName = customerName;
            System.out.println("Standard Room " + getRoomNumber() + " booked successfully by " + customerName);
        } else {
            System.out.println("Room " + getRoomNumber() + " is already booked.");
        }
    }

    @Override
    public void cancelBooking() {
        if (!isAvailable) {
            this.isAvailable = true;
            this.customerName = null;
            System.out.println("Booking for Standard Room " + getRoomNumber() + " has been canceled.");
        } else {
            System.out.println("Room " + getRoomNumber() + " is not booked yet.");
        }
    }
}
