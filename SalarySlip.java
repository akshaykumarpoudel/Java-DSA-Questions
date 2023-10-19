import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        System.out.print("Enter basic salary: ");
        double basic = input.nextDouble();

        double hra = 0.3 * basic;
        double da = 0.2 * basic;
        double ta = 2000;

        double gross = basic + hra + da + ta;

        double tax = calculateTax(gross);

        double net = gross - tax;

        displaySalarySlip(name,basic,hra,da,ta,gross,tax,net);


        input.close();
    }
    static double getHRA(double basic)
    {
        return 0.3*basic;
    }
    static double getDA(double basic)
    {
        return 0.2*basic;
    }
    static double getTA()
    {
        return 2000.0;
    }
    static double calculateTax(double gross)
    {
        double tax=0;
        if (gross >= 50000) {
            tax = 0.2 * gross;
        } else if (gross >= 30000) {
            tax = 0.15 * gross;
        } else if (gross >= 15000) {
            tax = 0.1 * gross;
        }
        return tax;
    }
    public static void displaySalarySlip(String name,double basic,double hra,double da,double ta,double gross,double tax,double net)
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Income Tax: " + tax);
        System.out.println("Net Salary: " + net);
    }
}