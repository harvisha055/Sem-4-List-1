import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        double r,area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle :: ");
        r = sc.nextDouble();

        area = Math.PI * Math.pow(r, 2);
        System.out.println("Area of a Circle :: " +(area));
    }
}