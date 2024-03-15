package lesson27;

import lesson26.homework26.Circle;
import lesson26.homework26.Figura;
import lesson26.homework26.Rectangle;
import lesson26.homework26.Triangle;

/**
 * AIT-TR, cohort 42.1, Java Basic, #27
 * @author Alexandru Postica
 * @version 15.Mar
 */
public class Lesson27 {
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
