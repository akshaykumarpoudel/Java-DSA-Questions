import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseDigit(number);

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseDigit(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return reversedNumber;
    }
}
