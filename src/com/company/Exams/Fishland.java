package com.company.Exams;
import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double wantPriceSkumria = Double.parseDouble(console.nextLine());
        double wantPriceCaca = Double.parseDouble(console.nextLine());
        double kilosPalamud = Double.parseDouble(console.nextLine());
        double kilosSafrid = Double.parseDouble(console.nextLine());
        int kilosShells = Integer.parseInt(console.nextLine());

        double pricePalamud = (0.60 * wantPriceSkumria) + wantPriceSkumria;
        double priceSafrid = (0.80 * wantPriceCaca) + wantPriceCaca;
        double priceShells = 7.50;


        double totalPriceSkumria = wantPriceSkumria;
        double totalPriceCaca = wantPriceCaca;
        double totalPricePalamud = pricePalamud * kilosPalamud;
        double totalPriceSafrid = priceSafrid * kilosSafrid;
        double totalPriceShells = kilosShells * priceShells;


        double totalPrice =  totalPricePalamud + totalPriceSafrid + totalPriceShells;

        System.out.printf("%.2f",totalPrice);

    }
}