package Task_2;

public class main {

    public static void main(String[] args) {
        Vehicle car = Vehicle.getInstance("Honda", 200, 10000.0);
        Vehicle bike = Vehicle.getInstance("Suzuki", 370, 8000.0);
        Vehicle plane = Vehicle.getInstance("F-35", 1400, 2000000.0);

        System.out.println(car);
        System.out.println(bike);
        System.out.println(plane);
    }
}
