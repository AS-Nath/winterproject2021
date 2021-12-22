import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = 0;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                hcf = i;
        }
        System.out.println("The HCF of the two numbers is: " + hcf);
        sc.close();
    }
}
