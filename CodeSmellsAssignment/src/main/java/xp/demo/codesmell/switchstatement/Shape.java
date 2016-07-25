package xp.demo.codesmell.switchstatement;

import java.text.DecimalFormat;

public class Shape {
    public static final int RECTANGLE = 0;
    public static final int CIRCLE = 1;
    public static final int SQUARE = 3;
    private double length;
    private double width;
    private double radius;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(int shape) {
        double area = 0;
        switch (shape) {
            case RECTANGLE:
                area = length * width;
                break;
            case SQUARE:
                area = length * length;
                break;
            case CIRCLE:
                DecimalFormat formater = new DecimalFormat("#.##");
                area = Double.valueOf(formater.format(Math.PI * radius * radius));
                break;
        }
        return area;
    }

    public double calculatePerimeter(int shape) {
        double perimeter = 0;
        switch (shape) {
            case RECTANGLE:
                perimeter = 2 * (length + width);
                break;
            case SQUARE:
                perimeter = 4 * length;
                break;
            case CIRCLE:
                DecimalFormat formater = new DecimalFormat("#.##");
                perimeter = Double.valueOf(formater.format(2 * Math.PI * radius));
                break;
        }
        return perimeter;
    }
}