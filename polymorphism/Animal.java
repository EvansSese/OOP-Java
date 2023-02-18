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

class Dog extends Animal {
    @Override
    public void make_sound() {
        System.out.println("Dog barks");
    }
}

class Snake extends Animal {
    @Override
    public void make_sound() {
        System.out.println("Snake hisses");
    }
}
