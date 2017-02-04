package com.company.Basics;
import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String pass = "s3cr3t!P@ssw0rd";


        if ("s3cr3t!P@ssw0rd".equals(text)) {
            System.out.println("Welcome!"); }

        else {
            System.out.println("Wrong password!"); }


    }
}