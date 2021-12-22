//WAP to accept a number and print prime numbers in a range.
import java.util.*;

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        int upper = sc.nextInt();

        System.out.println();

        for (int i = lower; i <= upper; i++) {
            boolean isPrime = Prime(i);
            if (isPrime == true) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    public static boolean Prime(int i) {
        boolean return_val = true;
        for (int c = 2; c < i; c++) {
            if (i % c == 0) {
                return_val = false; 
            }
        }
        return return_val;
    }

}