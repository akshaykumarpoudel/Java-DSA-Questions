//Rhombus
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
