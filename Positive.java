import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        String s=(a>0)?"Positive":((a<0)?"Negative":"Zero");
        System.out.println(s);
    }
}
