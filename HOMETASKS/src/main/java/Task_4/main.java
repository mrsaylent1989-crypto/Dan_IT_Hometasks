package Task_4;

public class main {
    public static void main(String[] args) {
        car car = new car.Builder()
                .setModel("BMW")
                .setPrice(7500)
                .setMaxSpeed(310)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);
    }
}
