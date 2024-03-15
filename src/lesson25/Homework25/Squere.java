package lesson25.Homework25;

public class Squere extends Figura{
    private int side;

    public Squere(int side) {
        this.side = side;
    }

    @Override
    protected double calcArea() {
        return side * side;
    }
}
