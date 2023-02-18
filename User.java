// declare user class
public class User {
    // declare class properties
    String username;
    String address;
    int age;

    // declare constructor method
    public User(String username, String address, int age) {
        this.username = username;
        this.address = address;
        this.age = age;
    }

    // declare getter methods
    public String get_name() {
        return username;
    }

    public String get_address() {
        return address;
    }

    public int get_age() {
        return age;
    }
}
