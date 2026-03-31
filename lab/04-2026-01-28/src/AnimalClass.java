abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    void makeSound(){
        System.out.println("Meow meow");
    }
}

class Dog extends Animal {
    void makeSound(){
        System.out.println("Woof woof!");
    }
}

public class AnimalClass {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.makeSound();

        Animal d = new Dog();
        d.makeSound();
    }
}
