/*Address.java is a Java class that represents an address. 
 *  It has four fields: street, city, province, and code.
 * The toString() method is overridden to return the address in a readable format.
 */


public class Address {
    private String street;
    private String city;
    private String province;
    private String code;

    public Address(String street, String city, String province, String code) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.code = code;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return street + ", " + city + ", " + province + ", " + code;
    }

    // Optional: Add a main method if you need to run this class directly
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62704");
        System.out.println(address);
    }
}
