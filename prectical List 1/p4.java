import java.util.Scanner;

public class p4 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer number :: ");
        int n  = sc.nextInt();
        int rnum = 0;
           while (n > 0) {
            int r = n % 10;
             n = n/10;

            rnum = rnum *10 + r;
           }
           System.out.println("Reverse Number ::" + rnum);
    }
}