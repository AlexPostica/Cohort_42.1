package lesson26.homework26;
/**
 * AIT-TR, cohort 42.1, Java Basic,hw #26
 * @author Alexandru Postica
 * @version 13.Mar
 */
public class HomeWork26 {
    public static void main(String[] args) {
        Figura[] figuras = {new Circle(5),
                new Rectangle(5, 4,4),
                new Triangle(5,5,5)};
        for (Figura figura: figuras) {
            System.out.println(figura.calcArea());
            System.out.println(figura.calcPerimeter());
        }
    }
}
