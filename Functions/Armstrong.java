package Functions;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long a=s.nextLong();
        if(ArmStrongNumber(a))
        {
            System.out.println(a+" is Armstrong number: ");
        }
        else{
            System.out.println(a+" is not Armstring number: ");
        }
    }
    public static boolean ArmStrongNumber(long n)
    {
        long z=n,x=n;
        long a,b,c;
        long sum=0;
        int count=0;
        while(z>0)
        {
            count++;
            z/=z;
        }
        while(x>0)
        {
            a=x%10;
            sum+=Math.pow(a, count);
            x/=x;
        }
        if(sum==n)
            return true;
        else return false;
    }
}
