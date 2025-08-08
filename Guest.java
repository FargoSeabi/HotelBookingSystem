/*Guest.java class represents a guest at a 
 * hotel and contains their id, name, phone no. and address.
 */


public class Guest {
    private String id;
    private String name;
    private String phone;
    private String email;
    private String address;
/*The constructor takes five arguments: name, age, Phone, etc. 
 * The getName(), getAge(), and getPhone(), etc methods return the corresponding values for each field.
 */
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

public String getPhone() {
    return phone;
    }

public String getAddress() {
    return address;
}
public String getEmail() {
    return email;
}
/* The code snippet below is the constructor for the Guest class.
 * In Java, a constructor is a special method that is used to create a new object of a class.
 * In this case, the constructor takes five arguments: id, name, phone, email, and address.
 */

    public Guest(String id, String name,String phone,String email,String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
