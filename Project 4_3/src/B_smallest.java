import java.util.Scanner;

public class B_smallest {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int numb1=reader.nextInt();
		int numb2=reader.nextInt();
		int numb3=reader.nextInt();
		int largest=0;
		
		if (numb1>numb2 && numb1>numb3)
		{
			largest=numb1;
			System.out.println("largest: "+largest);
			if (numb2>numb3) {
				System.out.println("Second largest: "+numb2);
				System.out.println("Third largest: "+numb3);
			}

			else {
				System.out.println("Second largest: "+numb3);
				System.out.println("Third largest: "+numb2);				
				
		}
		if (numb2>numb1 && numb2>numb3)
			largest=numb2;
			System.out.println("largest: "+largest);
			if (numb3>numb1) {
				System.out.println("Second largest: "+numb3);
				System.out.println("Third largest: "+numb1);
		}

		else {
			System.out.println("Second largest: "+numb1);
			System.out.println("Third largest: "+numb3);
		
		if (numb3>numb2 && numb3>numb1)
			largest=numb3;
			System.out.println("largest: "+largest);
			if (numb2>numb1) {
				System.out.println("Second largest: "+numb2);
				System.out.println("Third largest: "+numb1);
		}

		else {
			System.out.println("Second largest: "+numb1);
			System.out.println("Third largest: "+numb2);
		


		


	

	}}

}
	}}
