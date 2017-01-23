package com.company;

import java.util.Scanner;

public class ChristmasTree {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 19;

        for (int i = 0; i < n + 1; i++) {
            System.out.println(repeatStr(" ", n - i) + repeatStr("*", i) + " | " + repeatStr("*", i));
        }


    }

    public static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
