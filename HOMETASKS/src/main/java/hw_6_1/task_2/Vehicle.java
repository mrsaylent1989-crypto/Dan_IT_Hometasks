package hw_6_1.task_2;

public class Vehicle {

    private String name;
    private int speed;

    public String move(){
        return "The vehicle is traveling at a speed of X km/h";
    }
    public String stop(){
        return "The vehicle " + name + " stopping";
    }

    public Vehicle(int speed, String name) {
        this.speed = speed;
        this.name = name;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
