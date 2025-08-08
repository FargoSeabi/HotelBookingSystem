import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* The Main class is the entry point of the program, and it creates a Hotel object and adds
 * four single rooms, four double rooms, and four triple rooms to it. The Hotel.showAvailableRooms
 * method is then used to display the available rooms.
 */
public class Main {

    private static Date returnDate(String date1) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            return(dateFormat.parse(date1));
        } catch (ParseException e) {
            return null;
        }
    }


    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        Hotel hotel = new Hotel(10011, "UL Hotel",new Address("101 St.", "Polokwane", "Limpopo", "0760"), 1);
/* The for loop is used to add the rooms to the hotel, with the room number,
 * capacity, and price per night as the arguments.
 */
        for (int i = 0; i < 4; i++) {
            hotel.addRoom(new Room(i+101, Capacity.SINGLE, 10.0));
        }
        for (int i = 4; i < 8; i++) {
            hotel.addRoom(new Room(i+101, Capacity.DOUBLE, 20.0));
        }
        for (int i = 8; i < 12; i++) {
            hotel.addRoom(new Room(i+101, Capacity.TRIPLE, 30.0));
        }
        hotel.showAvailableRooms();

        Guest guest = new Guest("05031525232080", "Sam", "0721646430", "Sam@mai.com", "MBK 0000");
        Reservation reservation = hotel.reserveRoom(guest, 103, "2024-07-26");
        if (reservation != null) System.out.println(reservation);

        hotel.showAvailableRooms();


        //The user interaction
        char roomTypeTemp;
        Capacity roomType;
        String checkInDate, checkOutDate;
        Date checkIn, checkOut;
        String name, phone, email, address;
        String id;
        int roomNo;

        System.out.println();

        System.out.println("Please provide your check in date in the format \"yyyy-MM-dd\": ");
        checkInDate = cin.nextLine();
    
        System.out.println("Please provide your check out date in the format \"yyyy-MM-dd\": ");
        checkOutDate = cin.nextLine();
    
        System.out.println("Please provide your names: ");
        name = cin.nextLine();

        System.out.println("Please provide your email: ");
        email = cin.nextLine();
        

        System.out.println("Please provide your phone numbers: ");
        phone = cin.nextLine();
        

        System.out.println("Please provide your address: ");
        address = cin.nextLine();
    
        System.out.println("Please provide your ID number: ");
        id = cin.nextLine();

        System.out.println("Choose your preferred room type by entering \na) Single \nb) Double \nc) Triple");
        roomTypeTemp = cin.next().charAt(0);

        if (roomTypeTemp == 'a') roomType = Capacity.SINGLE;
        else if (roomTypeTemp == 'b') roomType = Capacity.DOUBLE;
        else roomType = Capacity.TRIPLE;
// The Guest class is used to represent the guest, and it takes five arguments: ID, name, phone number, email, and address.
        guest = new Guest (id, name, phone, email, address);
        checkIn = returnDate(checkInDate);
        checkOut = returnDate(checkOutDate);
        roomNo = hotel.returnRoomNo(roomType);
        reservation = hotel.reserveRoom(guest, roomNo, checkIn, checkOut);

        //Testing
        System.out.println();
        //System.out.println("The string roomType : " + roomTemp + "\nThe capacity room type : " + hotel.returnRoomType(roomType) + "\nThe room number : " + hotel.returnRoomNo(returnRoomType(roomType)));

        System.out.println();
        System.out.println(reservation);
// The Hotel.showAvailableRooms method is then used to display the available rooms.
        hotel.showAvailableRooms();

        //To close the System.in
        cin.close();
    }
}