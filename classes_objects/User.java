package classes_objects;

/**
 * User
 */

// define the User class
public class User {

    // define the class properties
    String username;
    String email;

    // define the constructor method
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public static void main(String[] args) {
        // create the user object
        User u1 = new User("Evans Sese", "evanssese166@gmail.com");
        System.out.println(u1.username);
    }
}