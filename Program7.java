import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        System.out.println(decimalToBinary(n));
        sc.close();
    }

    public static int decimalToBinary(int n) {

        // To store the binary number
        int B_Number = 0;
        int exp = 0;
        while (n != 0) {
            int rem = n % 2;
            double c = Math.pow(10, exp);
            B_Number += rem * c;
            n /= 2;

            // Count used to store exponent value
            exp++;
        }
        return B_Number;
    }
}
