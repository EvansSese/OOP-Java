package polymorphism;

public class Animal {

    // method to make sound for the animal sound
    public void make_sound() {
        System.out.println("Animal making sound");
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Snake();

        for (Animal animal : animals) {
            animal.make_sound();
        }
    }
}

// create subclass Dog to extend Animal
class Dog extends Animal {

    // override the make_sound method
    @Override
    public void make_sound() {
        System.out.println("Dog barks");
    }
}

// create subclass Snake to extend Animal
class Snake extends Animal {

    // override the make_sound method
    @Override
    public void make_sound() {
        System.out.println("Snake hisses");
    }
}
