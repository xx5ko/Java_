package com.company;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());

        boolean isValid = (num >= 100 && num <= 200) || num == 0;
        if (!isValid) {
            System.out.println("invalid");
        }
    }
}