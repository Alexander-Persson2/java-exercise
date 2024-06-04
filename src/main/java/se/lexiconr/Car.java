package se.lexiconr;

public class Car {
    // Attributes of the Car class
    private String brand;
    private String registrationNumber;
    private int maxSpeed;
    private String ownerName;
    private String color;

    // Constructor to initiliaze the attributes
    public Car(String brand, String registrationNumber, int maxSpeed, String ownerName, String color) {
     this.brand = brand;
     this.registrationNumber = registrationNumber;
     this.maxSpeed = maxSpeed;
     this.ownerName = ownerName;
     this.color = color;
    }
    // Getter methods to acess the private attributes
    public String getBrand() {
        return brand;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getColor() {
        return color;
    }
    // Setter methods to modify the private attributes

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void SetColor(String color) {
        this.color = color;
    }





}
