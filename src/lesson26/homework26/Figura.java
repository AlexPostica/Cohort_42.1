package lesson26.homework26;

public abstract class Figura {
    protected int side;

    public Figura(int side) {
        this.side = side;
    }

    public abstract double Area();
    public abstract double Perimeter();
}
