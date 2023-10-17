import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age of the person: ");
        age=sc.nextInt();
        String z=((age>0 && age<12)?"Child":((age>12 && age<19)?"Teenager":((age>19 && age<60)?"Adult":"Senior")));     
        System.out.println(z);                 
    }
}
