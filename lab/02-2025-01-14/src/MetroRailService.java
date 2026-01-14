import java.util.Objects;

class MetroTicket{
    String name;
    String source;
    String destination;
    boolean roundTrip = false;
    String seatClass = "Regular";
    String discountCode = "N/A";
    double fareFactor = 1;
    double fare = 0;

    MetroTicket(String name, String source, String destination){
        this.name = name;
        this.source = source;
        this.destination = destination;
    }

    MetroTicket(String name, String source, String destination, boolean roundTrip){
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;
    }

    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass){
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;
        this.seatClass = (Objects.equals(seatClass, "Premium") ? "Premium" : "Regular");
    }

    MetroTicket(String name, String source, String destination, String seatClass){
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.seatClass = (Objects.equals(seatClass, "Premium") ? "Premium" : "Regular");
    }

    MetroTicket(String name, String source, String destination, boolean roundTrip, String seatClass, String discountCode){
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.seatClass = (Objects.equals(seatClass, "Premium") ? "Premium" : "Regular");
        this.discountCode = discountCode;
        this.fareFactor = (Objects.equals(discountCode, "DIS10") ? 0.9 : 1);
    }

    MetroTicket(String name, String source, String destination, String seatClass, String discountCode){
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.seatClass = (Objects.equals(seatClass, "Premium") ? "Premium" : "Regular");
        this.discountCode = discountCode;
        this.fareFactor = (Objects.equals(discountCode, "DIS10") ? 0.9 : 1);
    }

    void calculateFare(){
        fare = 0.0;
        if(seatClass == "Premium" && roundTrip) {
            fare = 270;
        } else if(seatClass == "Regular" && roundTrip) {
            fare = 180;
        } else if(seatClass == "Premium") {
            fare = 150;
        } else if(seatClass == "Regular") {
            fare = 100;
        }
        fare = fare * fareFactor;
    }

    void displayTicketDetails(){
        calculateFare();
        System.out.println("Name: " + name);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Discount Code: " + discountCode);
        System.out.println("Is Round Trip?: " + roundTrip);
        System.out.println("Seat Class: " + seatClass);
        System.out.println("Fare: " + fare + "\n");
    }
}

public class MetroRailService {
    public static void main(String[] args){
        MetroTicket M1 = new MetroTicket("Shayan", "Motijheel", "Uttara");
        MetroTicket M2 = new MetroTicket("Shayan", "A", "B", true);
        MetroTicket M3 = new MetroTicket("Shayan", "A", "B", "Premium");
        MetroTicket M4 = new MetroTicket("Shayan", "A", "B", true,"Premium");
        MetroTicket M5 = new MetroTicket("Shayan", "A", "B", true,"Premium", "DIS10");
        MetroTicket M6= new MetroTicket("Shayan", "A", "B", true,"Regular", "DIS10");

        M1.displayTicketDetails();
        M2.displayTicketDetails();
        M3.displayTicketDetails();
        M4.displayTicketDetails();
        M5.displayTicketDetails();
        M6.displayTicketDetails();
    }
}
