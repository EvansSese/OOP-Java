package inheritance;

//declare Student class to inherit from User class
public class Student extends User {
    boolean has_scholarship;

    // declare constructor method for Student subclass
    public Student(String username, String address, int age, boolean has_scholarship) {
        // inherit properties from super class
        super(username, address, age);
        this.has_scholarship = has_scholarship;
    }

    // getter method
    public boolean get_has_scholarship() {
        return has_scholarship;
    }

    // setter method
    public void set_has_scholarship(boolean has_scholarship) {
        this.has_scholarship = true;
    }

    public static void main(String[] args) {
        // creating the student object, from student subclass
        Student s1 = new Student("Evans", "Nairobi", 28, false);

        System.out.println(s1.get_has_scholarship());
    }
}
