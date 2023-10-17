import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms you want in the Fibonacci series: ");
        int n = scanner.nextInt();
        scanner.close();

        int firstTerm = 0;
        int secondTerm = 1;

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series (1 term):");
            System.out.println(firstTerm);
        } else {
            System.out.println("Fibonacci Series (" + n + " terms):");
            System.out.print(firstTerm + ", " + secondTerm);

            for (int i = 2; i < n; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(", " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }

            System.out.println();
        }
    }
}
