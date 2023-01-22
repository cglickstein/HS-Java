import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class A_dice {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter sum between 2 and 12: ");
		int sum=reader.nextInt();
		dice(sum);
	}
	public static void dice(int sum) 

	{
		int roll1=0;
		int roll2=0;
		int together=0;
		int rolls=0;
		Random generator=new Random();
		
		while (together!=sum)
			{
			roll1=(generator.nextInt(6)+1);
			roll2=(generator.nextInt(6)+1);
			together=roll1+roll2;
			rolls++;
			System.out.println(together);
			}
		//System.out.println(roll1);
		//System.out.println(roll2);

		
		System.out.println("The number of times the dice are rolled to get the sum of "+sum+" is "+ rolls);
	}
}
