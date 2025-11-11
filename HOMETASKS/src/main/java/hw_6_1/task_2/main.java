package hw_6_1.task_2;

public class main {
    public static void main(String[] args) {

        Car car = new Car(250, "BMW", 4);
        Truck truck = new Truck(50, "Berdyanck", 2000);

        System.out.println(car.move());
        System.out.println(car.stop());
        System.out.println("|-----------------------------------|");
        System.out.println(truck.move());
        System.out.println(truck.stop());
    }
}
