package com.company;
import java.util.Scanner;

public class EqualWords {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        String secondword = console.nextLine();



        if (word.equalsIgnoreCase(secondword))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}





