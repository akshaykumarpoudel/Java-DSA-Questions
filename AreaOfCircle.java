import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        float a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        a=sc.nextFloat();
        float area=3.14f*a*a;
        System.out.println("Area of Circle = "+area);
    }
}
