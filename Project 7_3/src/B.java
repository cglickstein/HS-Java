import java.util.Scanner;
public class B {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		int count=0;
		System.out.println("Enter a string of characters to count the vowels: ");
		String entry=reader.nextLine();
	    for(int i=0; i<entry.length();i++){
	        char ch = entry.charAt(i);	    
	        boolean vowel=isVowel(ch);
	        if (vowel==true)
	        	count++;
	        
	    }
	        
	    System.out.println("The number of vowels in "+entry+" is "+count);
	    
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
