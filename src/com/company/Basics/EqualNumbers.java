package com.company.Basics;
import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int  a = Integer.parseInt(console.nextLine());
        int  b = Integer.parseInt(console.nextLine());
        int  c = Integer.parseInt(console.nextLine());

        if ((a==b) && (b==c)) {
            System.out.println("Yes!");
        }
        else {
            System.out.println("No!");}
    }
}
