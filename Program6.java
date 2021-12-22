import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = 0;
        lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.\n", n1, n2, lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}