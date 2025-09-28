package application;

import entities.Rectangle;

public class RectangleUtilizacao {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        double width = 3;
        double height = 4;

        System.out.println("Area retangulo = " + rectangle.area(width, height));
        System.out.println("Diagonal retangulo = " + rectangle.diagonal(width, height));
        System.out.println("Perimetro retangulo = " + rectangle.perimeter(width, height));
    }
}
