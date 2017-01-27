package Basics;

import java.util.Scanner;

public class RectangleNN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i=0; i < n; i++) {
            System.out.println(repeatStr("*", n));
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
// II option
            // for (int i = 0; i < n ; i++) {
        // for (int j = 0; j < n; j++) {
       //  System.out.print("*");
       // }
      //  System.out.println();
