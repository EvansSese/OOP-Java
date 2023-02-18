package abstraction;

//create circle class to extend the abstract shape class
public class Circle extends Shape {
    // declare private radius property
    private int radius;

    // declare constructor class
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    // implement the getArea method
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // create circle object
        Shape c1 = new Circle(0, 0, 5);
        double circle_area = c1.getArea();
        System.out.println(circle_area);

    }
}
