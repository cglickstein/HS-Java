
public class c17 {

	public static void main(String[] args) {
		// FOR LOOPS. turn into for loop
		int var = 0;
		
		System.out.println("WHILE LOOP: ");
		while (var<5) //runs 6 times if 5 because stars out 1
		{
			System.out.println(var+1);
			var++;
			//initialize then condition then increment so not stuck in infinite loop
			//for loop takes all three and puts into one
		}
		
		System.out.println("FOR LOOP: ");
		for (int num=0; num<5;num++) //all in one statement
			//went from 0 to 1 and also equals so dont have to start at 0 
		{
			System.out.println(num+1);
		}
		
		System.out.println("Var:"+ (var+1)); //not changing value of variable
		System.out.println(var);
		var=var+1;
		
		
		//FOR LOOPS are COUNTER CONTROLED LOOP- counter is variable that keeps changing
		
		for (int counter=1; counter<=26; counter++) //need equals because started at one
		{
			System.out.println((char)(64+counter)); //numbers so can change
			//or keep 65 and make counter 0 and just < 26- not <=
		}
		
		//difference btwn .equals
		int x= 5;
		int y= 5;
		System.out.println(x==y); //for numbers
		String a = "Hi";
		String b = "Hi";
		System.out.println(a.equals("Hi")); //for strings
		System.out.println(a==b); //doesnt work in an if statement 
	}

}