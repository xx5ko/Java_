package com.company.Basics;

import java.util.Scanner;

public class Excellence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter your grade: ");
        double grade = Double.parseDouble(console.nextLine());

        if (grade >= 5.50)
        {
            System.out.printf("Excellent!");
        }
        else {
        System.out.printf("Not excellent!");
        }

        }
    }

