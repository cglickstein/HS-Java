import java.util.Scanner;
public class RECURSION {

	public static void main(String[] args) {
		System.out.println("Enter list of words, one per line: ");
		System.out.println("Final word should be a period");
		//System.out.println(stackWords2());
		//drawLine(3);
		//System.out.println(filter("papaya","pa"));
		//mystery(4);
		mystery2(4);
	}
	public static void mystery2(int n) {
		if(n<=0)
			return;
		System.out.println(n-1);
		for(int i=0;i<n;i++)
		{
			System.out.println("-");
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("++++");
		}
		mystery(n-1);
		
	}
	

	public static void mystery(int n) {
		if(n<=0)
			return;
		for(int i=0;i<n;i++)
		{
			System.out.println("-");
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("++++");
		}
		mystery(n-1);
		
	}
	

	public static String filter(String str, String pattern) {

		int pos=str.indexOf(pattern);
		System.out.println(pos);
		if (pos==1)
			return str;
		else 
			return (filter(str.substring(0,pos)+str.substring(pos+pattern.length()),pattern));
		//cuts off after find pattern
		//starts at end and goes to end
	}

	public static void drawLine(int n) {
		if (n==0) //base case which is way to stop recursion
			System.out.println("The End");
		else {
			for (int i=1; i<n;i++)
			{
				System.out.println("*"); //for each n print star
			}
			System.out.println();
			drawLine(n-1);
		}
		
	}

	public static void stackWords() {
		Scanner IO= new Scanner(System.in);
		String word=IO.nextLine();
		if (word.equals("."))
			System.out.println();
		else
			stackWords();
		System.out.println(word); //this doesn't happen yet but it goes in a place storing code. This is sitting there waiting to get printed
		
		
	}
	public static String stackWords2() {
		Scanner IO= new Scanner(System.in);
		String word=IO.nextLine();
		if (word.equals("."))
			return "the end"; //prints the last thing that was returned
		else
			return stackWords2();
		//never returns anything because keeps calling but then by the time it gets . it returns the end
		 //this doesn't happen yet but it goes in a place storing code. This is sitting there waiting to get printed
	
		
		
	}
}
