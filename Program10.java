import java.util.*;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int c = 3;
        System.out.println("The series until the given number is: ");
        System.out.println("2"); // known prime
        while (i < n - 1) {
            if (Prime(c)) {
                System.out.println(c);
                i++;
            }
            c++;
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
