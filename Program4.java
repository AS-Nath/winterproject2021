/*
WAP to accept the amount of time in hours and minutes a bike is parked in a parking lot
from the user and print the bill to be charged to the customer. Please follow the chart below
to calculate the bill:

TIME                                CHARGE in rupees
Up to 1hour                         20/-
Every 30 minutes and part thereof   10/-
*/
import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter the number of minutes: ");
        int min = sc.nextInt();
        int charge = 0;
        if (hours >= 1) {
            charge += 20;
            hours--;
        }
        int total_min = min + (hours * 60);
        System.out.println(total_min);
        while (total_min >= 30) {
            total_min -= 30;
            charge += 10;
            System.out.println(charge);
        }
        if (total_min > 0) {
            charge += 10;
        }
        System.out.println("Total charge: Rs." + charge);
        sc.close();
    }
}
