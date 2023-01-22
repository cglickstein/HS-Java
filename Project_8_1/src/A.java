import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int[] numbers=new int[5]; 

		for (int i=0; i<numbers.length; i++)
		{
			System.out.print("Enter number: ");
			numbers[i]=a.nextInt();
		}

			
		
		int sum=0;
		for (int i=0; i<numbers.length; i++)
			sum+=numbers[i];
		System.out.println("sum: "+sum);
			
	    for (int index = numbers.length-1; index >= 0; index--)
		       System.out.print (numbers[index] + "  ");
		
		
		
		
		/*for (int i=0; i<numbers.length; i++)
			System.out.println("index"+i+"    "+numbers[i]);
		
	     for (int index = numbers.length+1; index <= 10; index++)
	          System.out.print (numbers[index] + "  ");

	      System.out.println ("\nThe numbers in reverse order:");

	      for (int index = numbers.length-1; index >= 0; index--)
	         System.out.print (numbers[index] + "  ");*/

	}

}

