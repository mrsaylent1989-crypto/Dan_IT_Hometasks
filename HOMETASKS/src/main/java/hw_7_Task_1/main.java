package hw_7_Task_1;

import java.util.List;

public class main {
    public static void main(String[] args) {

        System.out.println("Warehouse demonstration");

        warehouse<String> warehouse = new warehouse<>();

        warehouse.addItem("book");
        warehouse.addItem("pen");
        warehouse.addItem("notebook");

        System.out.println("Number of items: " + warehouse.getItemCount());
        System.out.println("View items: " + warehouse.viewItems());

        List<String> taken = warehouse.retrieveAll();
        System.out.println("Took the items: " + taken);

        System.out.println("The warehouse is empty? " + warehouse.isEmpty());

        warehouse.addItem("Marker");
        System.out.println("After adding: " + warehouse.viewItems());

        warehouse.clear();
        System.out.println("After cleaning, the warehouse is empty? " + warehouse.isEmpty());
    }
}