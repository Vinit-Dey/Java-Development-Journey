import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        int p;
        float r,t,si;

        Scanner sc = new Scanner (System.in);

        System.out.println("-----Simple Interest Calculator-----");
        
        System.out.println("Enter the Principle Amount: ");
        p=sc.nextInt();

        System.out.println("Enter the Rate of Interest: ");
        r=sc.nextFloat();

        System.out.println("Enter the Time Period: ");
        t=sc.nextFloat();

        si = (p*r*t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
