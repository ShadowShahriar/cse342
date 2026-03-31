abstract class Vehicle {
    abstract void show();
}

class Car extends Vehicle {
    void show(){
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    void show(){
        System.out.println("Bike started");
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        c1.show();

        Vehicle b1 = new Bike();
        b1.show();
    }
}
