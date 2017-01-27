package Basics;
import java.util.Scanner;

public class SpeedInfo {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());

        if (num <=10)
            System.out.println("slow");


        if(10<num && num<=50)
            System.out.println("average");


        if(50<num && num<=150)
            System.out.println("fast");

        if(150<num && num<=1000)
            System.out.println("ultra fast");

        if (num >1000)
            System.out.println("extremely fast");
    }
}