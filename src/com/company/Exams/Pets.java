package com.company.Exams;
import java.util.Scanner;
import java.text.*;

public class Pets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        int leftFood = Integer.parseInt(console.nextLine());
        double dogFood = Double.parseDouble(console.nextLine());
        double catFood = Double.parseDouble(console.nextLine());
        double turtleFood = Double.parseDouble(console.nextLine());



        double dogFoodNeed = dogFood * days;
        double catFoodNeed = catFood * days;
        double turtleFoodNeed = (turtleFood / 1000) * days;
        double totalFoodNeed = dogFoodNeed + catFoodNeed + turtleFoodNeed;

        if (totalFoodNeed <= leftFood) {
            double howMuchFoodLeft = (int)leftFood - totalFoodNeed;
            System.out.printf("%.0f kilos of food left.", Math.floor(howMuchFoodLeft));
        }
        else {
            double howMuchFoodLeft = Math.abs(totalFoodNeed - leftFood);
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(howMuchFoodLeft));
        }
    }
}
