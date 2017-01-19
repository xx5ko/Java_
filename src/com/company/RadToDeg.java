package com.company;

import java.util.Scanner;

public class RadToDeg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double radians = Double.parseDouble(console.nextLine());
        double degrees = (radians * 180)/ 3.14159265359;
        System.out.println(Math.floor(degrees));
    }
}