package hw_6_2.task_1;

public class main {
    public static void main(String[] args) {

        Figure square = new Square(5);
        Figure Circle = new Circle(7);
        Figure Triangle = new Triangle(12, 9,3,4,5);

        System.out.println("-----square-----");
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println("-----Circle-----");
        System.out.println(Circle.getArea());
        System.out.println(Circle.getPerimeter());
        System.out.println("-----Triangle-----");
        System.out.println(Circle.getArea());
        System.out.println(Circle.getPerimeter());

    }
}
