package com.company;
import java.util.Scanner;

public class Num100200 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        if (num <100)
            System.out.println("Less than 100");


        if(100<=num && num<=200)
            System.out.println("Between 100 and 200");

        if (num >200)
            System.out.println("Greater than 200");
    }
}