package com.company;

import java.util.Scanner;

public class Numbers1NVia3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <= n; i += 3) {
            System.out.println(i);
        }

    }
}
