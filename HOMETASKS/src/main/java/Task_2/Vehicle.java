package Task_2;

public class Vehicle {

    private static Vehicle instance;

    private String name;
    private int speed;
    private double price;

    private Vehicle(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public static Vehicle getInstance(String name, int speed, double price) {
        if (instance == null) {
            instance = new Vehicle(name, speed, price);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
