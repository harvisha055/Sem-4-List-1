import java.util.Scanner;

public class p1 {
    public static void main(String[] argus){
    double sum,avg;

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number one :: ");
    int a = sc.nextInt();
    System.out.print("Enter number one :: ");
    int b = sc.nextInt();
    System.out.print("Enter number one :: ");
    int c = sc.nextInt();
    sum = a+b+c;
    avg = sum/3;

    System.out.println("sum :: "+(sum));
    System.out.println("avg =  "+(avg));
    }
}