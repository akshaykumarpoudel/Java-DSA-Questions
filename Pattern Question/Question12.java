//plus pattern

import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<1;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int l=0;l<a*2;l++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
