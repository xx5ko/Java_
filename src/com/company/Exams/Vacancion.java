package com.company.Exams;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
import java.text.*;

public class Vacancion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int infantPeople = Integer.parseInt(console.nextLine());
        int students = Integer.parseInt(console.nextLine());
        int nights = Integer.parseInt(console.nextLine());
        String transport = console.nextLine().toLowerCase();
        double studentPrice = 0;
        double priceStudents = 0;
        double priceInfants = 0;

        int totalPeople = infantPeople + students;
        double nightPrice = 82.99;


        switch (transport) {
            case "train":
                priceInfants = 24.99;
                priceStudents = 14.99;
                if (totalPeople >= 50) {
                    priceInfants = 24.99 - (24.99 * 0.5);
                    priceStudents = 14.99 - (14.99 * 0.5);
                    break;
                }

            case "bus":
                priceInfants = 32.50;
                priceStudents = 28.50;
                break;


            case "ship":
                priceInfants = 42.99;
                priceStudents = 39.99;
                break;

            case "airplane":
                priceInfants = 70.00;
                priceStudents = 50.00;
                break;

        }


        double totalPriceTransport = ((infantPeople * priceInfants) + (priceStudents * students)) * 2;

            double totalPriceOfNights = nights * nightPrice;
            double comission = (totalPriceTransport + totalPriceOfNights) * 0.10;
            double totalPrice = totalPriceOfNights + totalPriceTransport + comission;


            System.out.printf("%.2f",totalPrice);
        }
    }
