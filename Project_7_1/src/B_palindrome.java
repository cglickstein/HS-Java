import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class B_palindrome {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=reader.nextLine();
		isPalindrome(reader, str);

	}
	public static void isPalindrome(Scanner u, String str) 
	{	int x=1;
		int strLength=str.length();
		boolean bool= true;
		for (int i=0;i<strLength;i++)
		{

			if (!(str.substring(i,x).equals(str.substring(strLength-x,strLength-i))))
				{
				bool=false;
				}
			x++;
		}
		if (bool==false)
		{
			System.out.println(str+" is not a palindrome.");
		}
		if (bool==true)
			System.out.println(str+ " is a palindrome.");
	}
}
