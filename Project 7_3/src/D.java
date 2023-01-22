import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner reader= new Scanner (System.in);
		System.out.println("Enter a number to assess whether it is a prime palindrome: ");
		int num=reader.nextInt();
		boolean flag=isPrime(num);
		if (flag==true)
		{
			System.out.println(num+" is a prime number.");
			String numString=Integer.toString(num);
			String reverse="";
			int length=numString.length();
			boolean flag2=isPalindrome(numString, reverse, length);
			if (flag2==true)
				System.out.println(num+" is a palindrome.");
			else
				System.out.println(num+" is not a palindrome.");
		}
		else
			System.out.println(num+" is not a prime number.");

	}

	private static boolean isPalindrome(String numString, String reverse, int length) {
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + numString.charAt(i);
	         
	      if (numString.equals(reverse))
	         return true;
	      else
	         return false;

	}

	private static boolean isPrime(int num) {

        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
            	return false;
            }
        }
		return true;
	}

}
