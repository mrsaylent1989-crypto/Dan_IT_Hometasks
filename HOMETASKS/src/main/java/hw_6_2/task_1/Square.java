package hw_6_2.task_1;

public class Square extends Figure {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return (side + side) * 2;
    }
}
