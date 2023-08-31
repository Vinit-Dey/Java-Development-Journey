import java.io.*;
import java.util.Scanner;

public class Odd_Even {
   public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a number to find out whether its odd or even: ");
        n=sc.nextInt();

        if (n%2==0) {
            System.out.println("The number is even.");
        }
        
        else {
            System.out.println("The number is odd.");
        }
   } 
}
