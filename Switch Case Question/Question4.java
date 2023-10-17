import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month (e.g., January, February, etc.): ");
        String month = scanner.nextLine();

        switch (month.toLowerCase()) {
            case "january":
            case "february":
            case "december":
                System.out.println("The season for " + month + " is winter.");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("The season for " + month + " is spring.");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("The season for " + month + " is summer.");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("The season for " + month + " is fall.");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid month.");
        }
    }
}