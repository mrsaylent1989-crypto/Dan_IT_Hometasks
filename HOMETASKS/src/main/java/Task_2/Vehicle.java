package Task_2;

public class Vehicle {
    private String name;
    private int speed;
    private double cost;
    private int countOfWhells;

    public Vehicle() {
    }

    public Vehicle(String name, int speed, double cost, int countOfWhells) {
        this.name = name;
        this.speed = speed;
        this.cost = cost;
        this.countOfWhells = countOfWhells;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCountOfWhells() {
        return countOfWhells;
    }

    public void setCountOfWhells(int countOfWhells) {
        this.countOfWhells = countOfWhells;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", cost=" + cost +
                ", countOfWhells=" + countOfWhells +
                '}';
    }
}
