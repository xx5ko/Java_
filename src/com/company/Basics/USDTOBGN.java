package Basics;

import java.util.Scanner;

public class USDTOBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double usd = Double.parseDouble(console.nextLine());
        double bgn = usd * 1.79549;

        System.out.printf("BGN: %.2flv.",bgn);

    }
}
