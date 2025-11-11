package hw_6_1.task_2;

public class Car extends Vehicle{

    private int passengerCapacity;

    public Car(int speed, String name, int passengerCapacity) {
        super(speed, name);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String move() {
        return "The vehicle " + getName() + " is traveling at a speed of 200 km/h with " + passengerCapacity + " people on board";
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
