package com.company;

import java.util.Scanner;

public class MaleOrFemale {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("Gender: ");
        String gender = console.nextLine();
        System.out.printf("Age: ");
        int age = Integer.parseInt(console.nextLine());

        if (gender.equals("m")) {
            if (age >= 16)
                System.out.println("Mr.");
            else
                System.out.println("Master");
        }

        if (gender.equals("f")) {
            if (age >= 16)
                System.out.println("Ms.");
            else
                System.out.println("Miss");
        }
    }
}