
package Basics;
import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("inches: ");
        double inch = Double.parseDouble(console.nextLine());
        double cm = inch * 2.54;

        System.out.println("centimeters = " + cm);

    }
}

