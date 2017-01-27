package com.company;

import java.util.Scanner;

public class Number1to100While {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        while (n < 1 || n > 100) {
            System.out.print("Invalid number!");
            n = Integer.parseInt(console.nextLine());
        }
        System.out.print("The number is: " + n);
    }

}
