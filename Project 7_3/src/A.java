import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter a character to see if it's a vowel: ");
		String entry=reader.next();
	    for(int i=0; i<entry.length();i++){
	        char ch = entry.charAt(i);	    
		boolean vowel=isVowel(ch);
		System.out.println("It is "+vowel+" that the character entered is a vowel.");
	    }
	}

	private static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			return true;
			}
		else
			return false;
	}

}
