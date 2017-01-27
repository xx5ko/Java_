package Basics;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Product: ");
        String product = console.nextLine().toLowerCase();
        System.out.println("City: ");
        String city = console.nextLine().toLowerCase();
        System.out.println("How much would you like? ");
        double quantity = Double.parseDouble(console.nextLine());
        double price = 0;

        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                price = 0.50;
            } else if (product.equals("water")) {
                price = 0.80;
            } else if (product.equals("beer")) {
                price = 1.20;
            } else if (product.equals("sweets")) {
                price = 1.45;
            } else if (product.equals("peanuts")) {
                price = 1.60;
            }
        }
        if (city.equals("varna")) {
            if (product.equals("coffee")) {
                price = 0.45;

            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.10;
            } else if (product.equals("sweets")) {
                price = 1.35;
            } else if (product.equals("peanuts")) {
                price = 1.55;
            }
        }
        if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                price = 0.40;
            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.15;
            } else if (product.equals("sweets")) {
                price = 1.30;
            } else if (product.equals("peanuts")) {
                price = 1.50;
            }
        }
        System.out.println("The price is: " + (price * quantity));
    }
}