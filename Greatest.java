import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int s=(a>b)?((a>c)?a:c):((b>c)?b:c);                            
        int s1=(a<b)?((a<c)?a:c):((b<c)?b:c);
        
        int z=(s!=a && s1!=a)?a:(s!=b && s1!=b)?b:c;

        
        System.out.println(s+" is greatest");
        System.out.println(z +" is Middle");
        System.out.println(s1+" is smallest");
        
        sc.close();
    }
}   
