package com.company.Basics;
import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("First name: ");
        String firstname = console.nextLine();
        System.out. printf("Last name: ");
        String lastname = console.nextLine();
        System.out.printf("Age: ");
        int age = Integer.parseInt(console.nextLine());
        System.out.printf("Town: ");
        String town = console.nextLine();

        System.out.printf("You are %s %s, a %d - years old person from %s.", firstname,lastname,age,town);
    }
}