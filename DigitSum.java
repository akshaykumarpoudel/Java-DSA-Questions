import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        int a,b=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        int sum=0;
        while(a>0)
        {
            b=a%10;
            sum+=b;
            a/=10;
        }
        System.out.println("The sum of digits = "+sum);
    }
}
