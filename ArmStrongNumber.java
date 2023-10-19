import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        long a=s.nextLong();
        if(ArmStrong(a))
        {
            System.out.println(a+" is Armstrong number: ");
        }
        else{
            System.out.println(a+" is not Armstrong number: ");
        }
        s.close();
    }
    public static boolean ArmStrong(long n)
    {
        long x=n;
        long a;
        long sum=0;
        long length=GetDigitLength(n);
        while(x>0)
        {
            a=x%10;
            sum+=Power(a, length);
            x/=10;
        }
        if(sum==n)
            return true;
        else return false;
    }
    public static long Power(long a,long b)
    {
        if(b==0)return 1;
        
        long result=1;
        for(int i=1;i<=b;i++)
        {
            result*=b;
        }
        return result;
    }
    public static long GetDigitLength(long n)
    {
        long count=0,z=n;
        while(z>0)
        {
            count++;
            z=z/10;
        }
        return count;
    }
}
