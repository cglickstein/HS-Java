import java.util.Scanner;

import java.util.Random;

public class c10 {

	public static void main(String[] args) {
		Random generator=new Random(); //instantiating object
		System.out.println(generator.nextInt(3)); //3 random numbers either 0, 1,2
//+1 so you don't include number
		System.out.println(generator.nextInt(100)+1);
		System.out.println(generator.nextDouble());//random number between 0 and 1. returns 0 but not 1.
		
		//int(generator.nextDouble*6)+10 because dooesnt do 6 and takes 5. same thing as before. doesnt include 0\
	
		
	}

}
