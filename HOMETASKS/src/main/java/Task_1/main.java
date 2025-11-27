package Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class main {

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 250);
        Car car2 = new Car("Volvo", 150);
        Car car3 = new Car("Lambargini", 320);
        Car car4 = new Car("Lada", 50);
        Car car5 = new Car("Nissan", 300);

        SortedSet<Car> cars = new TreeSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);
    }

}
