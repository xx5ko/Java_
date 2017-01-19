package com.company;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int firstnumber = Integer.parseInt(console.nextLine());
        int secondnumber = Integer.parseInt(console.nextLine());

        if (firstnumber > secondnumber) {
            System.out.println("The Bigger Number is " + firstnumber);
        }
        else {
            System.out.println("The Bigger Number is " + secondnumber);
        }
    }
}