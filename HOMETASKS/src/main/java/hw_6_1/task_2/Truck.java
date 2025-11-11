package hw_6_1.task_2;

public class Truck extends Vehicle{

    private double loadCapacity;

    public Truck(int speed, String name, double loadCapacity) {
        super(speed, name);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String move() {
        return "Transport " + getName() + " with a load capacity of " + loadCapacity + " is traveling at a speed of 35 km/h";
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
