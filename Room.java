/* The Room class represents a room in a hotel, and it contains information about the room such as the
 * room number, hotel ID, room type, price per night, and whether the room is available.
 * The class has two constructors, one that takes four arguments (roomNo, hotelId, roomType, and pricePerNight)
 * and another that takes three arguments (roomNo, roomType, and pricePerNight)
 */
public class Room {
    private final int roomNo;
    private int hotelId;
    private final Capacity roomType;
    private final double pricePerNight;
    private boolean available = true;

    public int getRoomNo() {
        return roomNo;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }
    public Capacity getRoomType() {
        return roomType;
    }
    public boolean isAvailable() {
        return available;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Room(int roomNo, int hotelId, Capacity roomType, double pricePerNight) {
        this.roomNo = roomNo;
        this.hotelId = hotelId;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }
    public Room(int roomNo, Capacity roomType, double pricePerNight) {
        this.roomNo = roomNo;
        this.hotelId = 0;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public Room reserve() throws Exception {
        if (available) {
            available = false;
            return this;
        } else {
            throw new Exception("Room " + roomNo + " is not available.");
        }
    }
/* The method below returns a string representation of the Room object, which includes the room 
 * number, type, and price per night.
 * The toString() method uses string concatenation to build the string by concatenating the 
 * values of the roomNo, roomType, and pricePerNight fields
 */
    @Override
    public String toString() {
        return "RoomNo: " + roomNo + ", Type: " + roomType.name() + ", Price(p.n): R" + pricePerNight;
    }
}
