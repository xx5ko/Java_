package Basics;

import java.util.Scanner;

public class AreOfTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

double side = Double.parseDouble(console.nextLine());
double heigh = Double.parseDouble(console.nextLine());

double area = (side * heigh)/2;

        System.out.printf("Area of triangle is %.2f", area);
    }
}