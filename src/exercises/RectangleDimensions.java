package exercises;
import java.util.Scanner;

public class RectangleDimensions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is the length of the rectangle:");
        Integer length = input.nextInt();

        System.out.println("What is the width of the rectangle:");
        Integer width = input.nextInt();

        int area = length * width;
        System.out.println("The width of " + width + " times the length of " + length + " makes the area of the rectangle: " + area + " units squared.");
    }
}
