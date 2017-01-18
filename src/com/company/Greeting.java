package com.company;
import java.util.Scanner;

public class Greeting {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter your name: ");
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);

    }
}
