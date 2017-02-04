package com.company.Exams;
import java.util.Scanner;
import java.text.*;

public class SoftuniCamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numOfStudentGroups = Integer.parseInt(console.nextLine());
        double car = 0.00;
        double miniBus = 0.00;
        double bus = 0.00;
        double bigBus = 0.00;
        double train = 0.00;
        double allStudents = 0.00;

        for (int i = 0; i < numOfStudentGroups; i++) {

            double students = Double.parseDouble(console.nextLine());

            if (students <= 5) {
                car += students;

            } else if (students >= 6 && students <= 12) {
                miniBus += students;

            } else if (students >= 13 && students <= 25) {
                bus += students;

            } else if (students >= 26 && students <= 40) {
                bigBus += students;

            } else if (students >= 41) {
                train += students;

            }
        }

             allStudents = car + miniBus + bus + bigBus + train;
        double carPercent = (car / allStudents) * 100;
        double miniBusPercent = (miniBus / allStudents) * 100;
        double busPercent = (bus / allStudents) * 100;
        double bigBusPercent = (bigBus / allStudents) * 100;
        double trainPercent = (train / allStudents) * 100;


        System.out.println(String.format("%.2f",carPercent) + "%");
        System.out.println(String.format("%.2f",miniBusPercent) + "%");
        System.out.println(String.format("%.2f",busPercent) + "%");
        System.out.println(String.format("%.2f",bigBusPercent) + "%");
        System.out.println(String.format("%.2f",trainPercent) + "%");

    }
}