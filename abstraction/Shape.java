package abstraction;

//declare abstract class for Shape
public abstract class Shape {

    protected int x, y;

    // declare constructor method
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // declare abstract getArea method
    public abstract double getArea();
}
