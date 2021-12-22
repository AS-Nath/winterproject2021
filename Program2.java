
/*
WAP to accept a two-digit number and check if it is a special number or not.
input: 59.
output: 59 is a Special Two-Digit Number
Explanation:
Sum of digits = 5 + 9 = 14
Product of its digits = 5 x 9 = 45
Sum of the sum of digits
and product of digits = 14 + 45 = 59
*/
import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum_digits = 0;
        int num_digits = 0;
        int copy = num;
        while (copy > 0) {
            sum_digits += copy % 10;
            copy /= 10;
            num_digits++;
        }
        int product_of_digits = 1;
        copy = num;
        while (copy > 0) {
            product_of_digits *= copy % 10;
            copy /= 10;
        }
        if (sum_digits + product_of_digits == num) {
            System.out.println("Special " + num_digits + "-digit number.");
        }
        else {
            System.out.println("Not a special number.");
        }
        sc.close();
    }
}
