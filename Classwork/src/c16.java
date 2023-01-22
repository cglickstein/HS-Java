
public class c16 {

	public static void main(String[] args) {
		// while loop- while certain condition is met, the loop runs
		//for loop- runs a specified amount of times, quicker
		
		int num=5;
		while (num<=5); //notice syntax- condition inside of parenthesis. if you do not have the squiggles then only first line in while
		{
			System.out.println(num);
			num+=1;
		}
		int num1=7;
		do
		{
			num+=1;
			System.out.println(num);
		}while (num<5); //automatically goes through everything once like when playing a guessing game THEN checks
		//at least enter one grade or one guess of a number instead of doing something to make sure it goes into while
		System.out.println(num+" out of the while.");
		
		double tuition=10000;
		int year=2018;
		while (year<2023); //notice syntax- condition inside of parenthesis. if you do not have the squiggles then only first line in while
		{
			System.out.println("Year: "+year+" Tuition: "+tuition);
			year+=1;
			tuition=tuition*.02+tuition;
			
		}
	}

}
