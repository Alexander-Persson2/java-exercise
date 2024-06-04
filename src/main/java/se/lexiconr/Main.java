package se.lexiconr;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Mercedes","ABC123", 240, "Ipsy Dipsum", "White");

        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Registration Number: " + myCar.getRegistrationNumber());
        System.out.println("Max Speed: " + myCar.getMaxSpeed());
        System.out.println("Owner Name: " + myCar.getOwnerName());
        System.out.println("Color: " + myCar.getColor());

        int score = 70;

        if (score >= 65) {
            System.out.println("Hurray, You passed!");
        }
        else if (score >= 55 && score <= 64) {
            System.out.println("You are almost there.");
        } else {
            System.out.println("Sorry, You did not pass");
        }
    }
}
