package application;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        entities.Triangle x, y;
        x = new entities.Triangle();
        y = new entities.Triangle();

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
