 import java.util.Scanner;

import java.util.Random;
public class B {

	public static void main(String[] args) {
		Random generator=new Random(); //instantiating object
		Scanner a= new Scanner(System.in);
		System.out.println("How many times should we roll the die? ");
		int times=a.nextInt();
		int[] numbers= new int [times] ;

		int[] dice= new int [7] ;

		for (int index=0; index<times; index++)
			numbers[index]=(generator.nextInt(6)+1);
		
		for (int i=0; i<numbers.length; i++)
		{
			dice[numbers[i]]+=1;
		}
		
		
		System.out.print("You rolled: ");
		for (int i=0; i<numbers.length; i++)
			{System.out.print(numbers[i]+" ");
			}
			

		System.out.println(" ");
		for (int i=1; i<dice.length; i++)
		{System.out.println("You rolled "+i+"-"+ dice[i] );

		}
		

		int max=0;
		int index=-1;
		
		for (int i=0;i<dice.length;i++)
		{
			if (dice[i]>max)
			{
				max=dice[i];
				index=i;

			}
		}
		System.out.println("You rolled the number "+index+" the most times.");
		
		
		
		
		
		




	}

}
