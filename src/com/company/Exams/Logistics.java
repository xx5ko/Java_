package com.company.Exams;
import java.util.Scanner;
import java.text.*;

public class Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int logistic = Integer.parseInt(console.nextLine());
        double bus = 0.00;
        double truck = 0.00;
        double train = 0.00;

        double totalTons = 0.00;

        for (int i = 1; i <= logistic; i++) {

            int tonsToShip = Integer.parseInt(console.nextLine());

            if (tonsToShip <= 3) {
                bus = bus + tonsToShip;

            } else if (tonsToShip >= 4 && tonsToShip <= 11) {
                truck = truck + tonsToShip;

            } else if (tonsToShip >= 12) {
                train = train + tonsToShip;
            }

            totalTons = totalTons + tonsToShip;
        }

        double busPrice = bus * 200;
        double truckPrice = truck * 175;
        double trainPrice = train * 120;

        double totalPrice = busPrice + truckPrice + trainPrice;

        System.out.println(String.format("%.2f",(totalPrice / totalTons)));
        System.out.println(String.format("%.2f",(bus / totalTons) * 100) + "%");
        System.out.println(String.format("%.2f",(truck / totalTons) * 100) + "%");
        System.out.println(String.format("%.2f",(train / totalTons) * 100) + "%");
    }
}