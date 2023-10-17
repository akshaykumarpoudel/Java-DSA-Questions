import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and bredth: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Area of Rectangle: "+(a*b));
    }
}
