import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        a=sc.nextInt();
        System.out.println((a%2==0)?"Even":"Odd");
        sc.close();
    }
}