class Vehicle {
    String maker, model, fuelType;
    int year;
    double distance, speed;
    double efficiencyFactor = 1;

    Vehicle(String maker, String model, String fuelType, int year){
        this.maker = maker;
        this.model = model;
        this.fuelType = fuelType;
        this.year = year;
    }

    void setDistanceSpeed(double distance, double speed){
        this.distance = distance;
        this.speed = speed;
    }

    void distanceTraveled(){
        System.out.println(distance + "km");
    }

    void maximumSpeed(){
        System.out.println((speed * efficiencyFactor) + "km/hr");
    }

    void calcFuelEfficiency(){
        System.out.println((distance / (speed * efficiencyFactor)) * 100);
    }
}

class Truck extends Vehicle {
    double efficiencyFactor = 0.35;
    Truck(String maker, String model, String fuelType, int year){
        super(maker,model,fuelType,year);
    }
}

class Car extends Vehicle {
    double efficiencyFactor = 0.7;
    Car(String maker, String model, String fuelType, int year){
        super(maker,model,fuelType,year);
    }
}

class Motorcylce extends Vehicle {
    double efficiencyFactor = 0.8;
    Motorcylce(String maker, String model, String fuelType, int year){
        super(maker,model,fuelType,year);
    }
}

public class VehicleClass {
    public static void main(String[] args) {
        Truck t1 = new Truck("Toyota", "Corolla", "petrol", 2019);
        t1.setDistanceSpeed(1100,24);
        t1.distanceTraveled();
        t1.maximumSpeed();
        t1.calcFuelEfficiency();
        System.out.println(" --- ");

        Car c1 = new Car("Toyota", "Motorolla", "electricity", 2022);
        c1.setDistanceSpeed(2100,56);
        c1.distanceTraveled();
        c1.maximumSpeed();
        c1.calcFuelEfficiency();
        System.out.println(" --- ");

        Motorcylce m1 = new Motorcylce("Toyota", "Hero", "disel", 2024);
        m1.setDistanceSpeed(3100,88);
        m1.distanceTraveled();
        m1.maximumSpeed();
        m1.calcFuelEfficiency();
        System.out.println(" --- ");
    }
}
