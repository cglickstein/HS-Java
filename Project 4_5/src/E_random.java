import java.util.Random;
import java.util.Scanner;
public class E_random {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		Random generator=new Random();
		int numb=(generator.nextInt(100)+1);//random number between 0 and 1. returns 0 but not 1.
		System.out.println("Guess a number: ");
		int guess= reader.nextInt();
		//System.out.println(numb);

		while (guess!=numb) //notice syntax- condition inside of parenthesis. if you do not have the squiggles then only first line in while
		{	

				
			if (guess<numb)
				{
				System.out.println("Guess higher: ");
				guess= reader.nextInt();
				}
				
			if (guess>numb)
				{
				System.out.println("Guess lower: ");
				guess= reader.nextInt();
				}
				
				
			
		
			
			
		}
System.out.println("Yay! you guessed the right number!");

	}

}
