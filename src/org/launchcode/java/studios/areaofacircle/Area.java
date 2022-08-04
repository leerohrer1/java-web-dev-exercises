package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import org.launchcode.java.studios.areaofacircle.Circle;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of the circle?");
        Double radius = input.nextDouble();

        Double Area = Circle.getArea(radius);
        System.out.println("The area of the circle is: " + Area);
    }
}
