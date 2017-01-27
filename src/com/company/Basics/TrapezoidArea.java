package Basics;
import java.util.Scanner;

public class TrapezoidArea {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("B1 = ");
        double b1 = Double.parseDouble(console.nextLine());
        System.out.printf("B2 = ");
        double b2 = Double.parseDouble(console.nextLine());
        System.out.printf("H = ");
        double h = Double.parseDouble(console.nextLine());
        double area = (b1+b2)*h/2.0;

        System.out.println("Trapezoid Area = " + area);
    }
}






