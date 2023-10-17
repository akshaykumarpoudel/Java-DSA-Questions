import java.util.Scanner;
public class Weight {
    public static void main(String[] args) {
        int height,weight;
        System.out.println("Enter your BMI: ");
        Scanner sc=new Scanner(System.in);
        height=sc.nextInt();
        weight=sc.nextInt();
        int bmi=weight/(height*height);
        String s=((bmi>=0 && bmi<=20)?"UnderWeight":(bmi>=20&&bmi<=25)?"Normal":(bmi>=25 && bmi<=30)?"Over Weight":"Obese");
        System.out.println(s);
    }
    
}
