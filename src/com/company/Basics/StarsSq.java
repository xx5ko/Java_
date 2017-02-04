package com.company.Basics;

import java.util.Scanner;

public class StarsSq {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 9;
        int space = n - 1;
        int stars = 1;


        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(" ", space) + repeatStr("* ", stars));

            space--;
            stars++;
        }

        space = 1;
        stars-= 2;
        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr(" ", space) + repeatStr("* ", stars));

            space++;
            stars--;
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
