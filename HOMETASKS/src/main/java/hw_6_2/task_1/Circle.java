package hw_6_2.task_1;

public class Circle extends Figure{

    double radius;
    double Pi = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (radius * radius) * Pi;
    }

    @Override
    public double getPerimeter() {
        return 2 * Pi * radius;
    }
}
