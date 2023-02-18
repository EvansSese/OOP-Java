package interfaces;

//declare an interface
public interface Drawable {
    // signature of the method to be implemented
    public void draw();
}

// declare a circle class to implement the interface
class Circle implements Drawable {

    // override the method in the interface
    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing a square");
    }
}

// invoke main method inside main class
class Main {
    public static void main(String[] args) {

        // create circle object
        Drawable circle = new Circle();
        // create square object
        Drawable square = new Square();

        circle.draw();
        square.draw();
    }
}