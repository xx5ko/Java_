package com.company.Basics;
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double input = Double.parseDouble(console.nextLine());
        String fromUnit = console.nextLine();
        String toUnit = console.nextLine();

        double meters = 0;

        double converted = 0;

        if (fromUnit.equals("mm")) {
            meters = input / 1000;
        } else if (fromUnit.equals("cm")) {
            meters = input / 100;
        } else if (fromUnit.equals("m")) {
            meters = input;
        } else if (fromUnit.equals("mi")) {
            meters = input / 0.000621371192;
        } else if (fromUnit.equals("in")) {
            meters = input / 39.3700787;
        } else if (fromUnit.equals("km")) {
            meters = input / 0.001;
        } else if (fromUnit.equals("ft")) {
            meters = input / 3.2808399;
        } else if (fromUnit.equals("yd")) {
            meters = input / 1.0936133;
        }

        if (toUnit.equals("mm")) {
            converted = meters * 1000;
        } else if (toUnit.equals("cm")) {
            converted = meters * 100;
        } else if (toUnit.equals("m")) {
            converted = meters;
        } else if (toUnit.equals("mi")) {
            converted = meters * 0.000621371192;
        } else if (toUnit.equals("in")) {
            converted = meters * 39.3700787;
        } else if (toUnit.equals("km")) {
            converted = meters * 0.001;
        } else if (toUnit.equals("ft")) {
            converted = meters * 3.2808399;
        } else if (toUnit.equals("yd")) {
            converted = meters * 1.0936133;
        }

        System.out.printf("%f, %s", converted, toUnit);

    }
}