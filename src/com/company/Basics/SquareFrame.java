package com.company.Basics;

import java.util.Scanner;

public class SquareFrame {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 5;

        System.out.println(("+ ") + repeatStr("- ", n - 2) + " +");

        for (int i = 0; i < n - 2; i++) {
            System.out.println("| " + repeatStr("- ", n - 2) + " |");
        }

        System.out.println(("+ ") + repeatStr("- ", n - 2) + " +");
    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
