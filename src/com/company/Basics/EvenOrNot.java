package Basics;

import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());

        if (number % 2 == 0) {
            System.out.println("Even!");
        }
        else {
            System.out.println("Not even!");
        }
    }
}