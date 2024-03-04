package lesson22;

public class Square extends Shape2D{
    int a;

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public double area() {
        return a * a;
    }
}
