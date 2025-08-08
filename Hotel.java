import java.time.Instant;
import java.util.*;
/* The Hotel class represents a hotel in a system, and it contains information about
 * the hotel such as its ID, name, address, rating, and a list of rooms.
 */
public class Hotel {
    private int hotelId;
    private String name;
    private Address address;
    private int rating;
    private Map<Integer, Room> rooms;
    public int getHotelId() {
        return hotelId;
    }
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
    public int getRating() {
        return rating;
    }
    /* The constructor for the Hotel class, and it is used to create a 
    *  new Hotel object by setting the values of its fields.
    */
    public Hotel(int hotelId, String name, Address address, int rating, List<Room> rooms) {
        this.hotelId = hotelId;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.rooms = new HashMap<>();
        rooms.forEach(room -> this.rooms.put(room.getRoomNo(), room));
    }

    public Hotel(int hotelId, String name, Address address, int rating) {
        this.hotelId = hotelId;
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.rooms = new HashMap<>();
    }

    public void addRoom(Room room) {
        room.setHotelId(hotelId);
        this.rooms.put(room.getRoomNo(), room);
    }

    public void showAvailableRooms() {
        for(Room room : rooms.values()) {
            if(room.isAvailable())
                System.out.println(room.toString());
        }
        System.out.println();
    }

        //Added functions

    public int returnRoomNo(Capacity roomType) {
        for(Room room : rooms.values()) {
            if(room.isAvailable() && room.getRoomType() == roomType) {
                return room.getRoomNo();
            }
        }
        return -1;
    } 

        //End here
/* The code below starts by getting the Room object from the rooms map using the roomNo parameter.
 * It then checks if the room is available and if it is, it tries to reserve it using the Room.reserve method.
 * If the room is successfully reserved, a new Reservation object is created using the current time,
 * the guest, the reserved room, the hotel, the check-in and check-out dates.
 */
    public Reservation reserveRoom(Guest guest, int roomNo, Date checkInDate, Date checkOutDate) {
        Room room = rooms.get(roomNo);

        if (room != null && room.isAvailable()) {
            try {
                Room reservedRoom = room.reserve();
                Date tDate = Date.from(Instant.now());
                return new Reservation(tDate.getTime() + roomNo + "", guest, reservedRoom, this, tDate, checkInDate, checkOutDate);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        } else {
            System.out.println("Room "+ roomNo + " is not available.\n");
        }
        return null;
    }
    /* The method below that takes three parameters: Guest guest, int roomNo, String checkOutDate.
     * The method first creates two Date objects using the current time and the check-out date 
     * string passed as a parameter.
     * The reserveRoom(Guest guest, int roomNo, Date checkInDate, Date checkOutDate) method tries to 
     *  reserve the room with the given room number, check-in date, and check-out date
     */

    public Reservation reserveRoom(Guest guest, int roomNo, String checkOutDate) {
        return reserveRoom(guest, roomNo, Date.from(Instant.now()), Date.from(Instant.parse(checkOutDate +"T08:00:00.00Z")));
    }
    public Reservation reserveRoom(Guest guest, int roomNo, String checkInDate, String checkOutDate) {
        return reserveRoom(guest, roomNo, Date.from(Instant.parse(checkInDate +"T08:00:00.00Z")), Date.from(Instant.parse(checkOutDate +"T08:00:00.00Z")));
    }
}

