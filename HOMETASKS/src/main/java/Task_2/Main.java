package Task_2;


import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {

        Vehicle car = new Vehicle("BMW", 350, 75000.00, 4);
        Vehicle bike = null;

        Vehicle somecar = Optional.ofNullable(car)
                .orElse(new Vehicle("Volvo", 220, 12000.00, 4));
        Vehicle somecar1 = Optional.ofNullable(car)
                .orElseGet(()-> new Vehicle("Volvo", 220, 12000.00, 4));
        Vehicle somecar2 = Optional.ofNullable(car)
                .orElseThrow(()-> new Exception("car no settings"));

        Vehicle somebike = Optional.ofNullable(bike)
                .orElse(new Vehicle("Suzuki", 210, 11000.00, 2));
        Vehicle somebike1 = Optional.ofNullable(bike)
                .orElseGet(()-> new Vehicle("Suzuki", 210, 11000.00, 2));
        Vehicle somebike2 = Optional.ofNullable(bike)
                .orElseThrow(()-> new Exception("bike no settings"));

        System.out.println(somecar);
        System.out.println(somecar1);
        System.out.println(somecar2);
        System.out.println(somebike);
        System.out.println(somebike1);
        System.out.println(somebike2);
    }
}
