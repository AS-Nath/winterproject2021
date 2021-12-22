/*
WAP to print next 3 prime numbers from a number given by the user.
*/
import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num_primes = 0;
        System.out.println("Next 3 primes are: ");
        while (num_primes < 3) {
            num++;
            boolean isPrime = Prime(num);
            if (isPrime == true) {
                System.out.println(num);
                num_primes++;
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
