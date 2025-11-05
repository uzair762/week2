package P4;

import java.util.Scanner;

public class AreaCalculator {
    final static double PI = 3.1;

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle = " + area(r));


        System.out.print("\nEnter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        System.out.println("Area of rectangle = " + area(l, w));

        System.out.print("\nEnter side of square: ");
        int s = sc.nextInt();
        System.out.println("Area of square = " + area(s));

        sc.close();
    }
}