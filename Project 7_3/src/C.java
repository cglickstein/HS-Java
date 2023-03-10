import java.util.Scanner;

public class C {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter a number to be reversed: ");
       int input = s.nextInt();
       int result = reverse(input);
       System.out.println("The reversed number is " + result);
   }

   public static int reverse(int n) {
       int result = 0;
       int rem;
       while (n > 0) {
           rem = n % 10;
           n = n / 10;
           result = result * 10 + rem;
       }
       return result;
   }
}