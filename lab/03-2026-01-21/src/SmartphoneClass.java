class Smartphone {
    private String brand, model;
    private int storageCapacity;

    Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    int getCapacity() {
        return storageCapacity;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    void setModel(String model){
        this.model = model;
    }

    void setStorage(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    void increaseStorage(int capacity){
        this.storageCapacity += capacity;
    }
}

public class SmartphoneClass {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone("Xiaomi", "Note 13 Pro+", 256);
        System.out.println(sp.getBrand());
        System.out.println(sp.getModel());
        System.out.println(sp.getCapacity());

        sp.setModel("Note 15+");
        sp.increaseStorage(256);
        System.out.println(sp.getModel());
        System.out.println(sp.getCapacity());
    }
}
