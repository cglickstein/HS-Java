import java.util.Scanner;

public class c7 {
	public static void main(String[] args) {
		Scanner reader= new Scanner (System.in);
// something in single quotes is a character which are primitive data types. 
//can compare by greater than and less than. 
//objects (like strings) are different
		char middleInit='M'; //character
		char ChemistryGrace='A';
		char aStar='*';
		char aCharValue='9';
		String aStrValue="9";
		System.out.println(aStrValue+1);
		System.out.println(aCharValue+1);
		//chars are just one thing. \n is just n
		char aNewLine='\n';
		char aTabchar='\t';
		System.out.println("Hello\nThere");
		System.out.println("Hello"+aNewLine+"there");
		String abc= "Happy";
		char letter=abc.charAt(0); //like index. taking happy
		System.out.println(letter);
		//for if statements you can just look at char because can't compare with strings
		System.out.println(letter); //stars counting with 0
		//getting an index out of bounds causes an error
		int len=abc.length();
		System.out.print(len);
		System.out.println(abc.charAt(len-1));
		
		
		
		
		
		
		
		
	}
}
