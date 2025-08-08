import java.util.Date;
/* The Reservation class represents a reservation at a hotel, and it contains information about the reservation such as the 
 * reservation ID, guest, room, hotel, date, check-in date, check-out date, and price.
 * The class has a constructor that takes seven arguments: resId, guest, room, hotel, date, checkInDate, and checkOutDate.
 */
public class Reservation {
    private String resId;
    private Guest guest;
    private Room room;
    private Hotel hotel;
    private Date date;
    private Date checkInDate;
    private Date checkOutDate;
    private double price;

    public Reservation(String resId, Guest guest, Room room, Hotel hotel, Date date, Date checkInDate, Date checkOutDate) {
        this.resId = resId;
        this.guest = guest;
        this.room = room;
        this.hotel = hotel;
        this.date = date;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.price = calculatePrice(room, checkInDate, checkOutDate);
    }

    public Guest getGuest() {
        return guest;
    }

    private double calculatePrice(Room room, Date checkInDate, Date checkOutDate) {

        int duration = (int) ((checkOutDate.getTime() - checkInDate.getTime()) / 3600000);

        return room.getPricePerNight() * duration;
    }

    /* The code below is part of the toString() method in the Reservation class.
     * This method is used to print the details of a reservation when it is displayed on the screen.
     */
    @Override
    public String toString() {
        return "*** Reservation ***" +
                "\nReference No  : " + resId +
                "\nRoom No       : " + room.getRoomNo() +
                "\nHotel         : " + hotel.getName() +
                "\nHotel Address : " + hotel.getAddress().toString() +
                "\nDate          : " + date.toString().substring(0, 10) +
                "\nCheck In Date : " + checkInDate.toString().substring(0, 10) +
                "\nCheck Out Date: " + checkOutDate.toString().substring(0, 10) +
                "\nDuration      : " + ((int) ((checkOutDate.getTime() - checkInDate.getTime()) / 3600000)) + " Hours" +
                "\nTotal Price   : " + "R" + price +
                "\n";
    }
}
