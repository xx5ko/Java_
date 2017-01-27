package Basics;
import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int hour = Integer.parseInt(console.nextLine());
        int min = Integer.parseInt(console.nextLine());
        min = min + 15;

        if (min >= 60)
        {
            min = min - 60;
            hour = hour + 1;

        }
        if (hour>23)
        {
            hour -=  24;

        }
        if (min < 10)
        {
            System.out.println(hour + ":" + "0" + min);
        }
        else
        {
            System.out.printf(hour + ":" + min);

        }


    }
}