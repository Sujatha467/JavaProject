public abstract class HotelRoom implements Bookable {
    private int roomNumber;
    protected boolean isAvailable;
    protected String customerName;

    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
        this.customerName = null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getCustomerName() {
        return customerName;
    }

    public abstract void bookRoom(String customerName);

    public abstract void cancelBooking();

    @Override
    public String toString() {
        return "Room " + roomNumber + " - " + (isAvailable ? "Available" : "Booked by " + customerName);
    }
}