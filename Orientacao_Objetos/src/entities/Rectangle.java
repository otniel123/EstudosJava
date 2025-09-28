package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(double w, double h){
        return w * h;
    }

    public double perimeter(double w, double h){
        return 2 * (w + h);
    }

    public double diagonal(double w, double h){
        return Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
    }
}
