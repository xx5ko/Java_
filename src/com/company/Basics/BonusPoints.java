package Basics;

import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        double bonusScore = 0;

        if (number <= 100) {
            bonusScore = 5;
        } else if (number > 100 && number <1000) {
            bonusScore = number * 0.2;
        } else if (number > 1000) {
            bonusScore = number * 0.1;
        }

        if (number % 2 == 0) {
            bonusScore += 1;
        } else if (number % 10 == 5) {
            bonusScore += 2;
        }
        System.out.println("Bonus: " + bonusScore);
        System.out.println("Total Score: " + number + bonusScore);
    }
}