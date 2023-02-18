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

class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable square = new Square();

        circle.draw();
        square.draw();
    }
}