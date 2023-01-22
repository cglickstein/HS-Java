import java.util.Scanner;

public class c2 {
//double can hold integer but not vice versa
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		//INSTANCE OF THE CLASS SCANNER - INSTANTIATION
		
		
		
		int amt; //PRIMITIVE DATA TYPE- LOWER CASE
		int total; //NUMBER WITH DECI
		//this means a variable will be put in called amount. it only holds a 2 digit number called double. 
		//Scanner is object so uppercase. amnt is not object but memory location off to side
		//puts in 0.0
		System.out.print("Enter a number: ");
		
		amt=reader.nextInt();
		//amt=reader.nextDouble(); //METHOD WITH PARENTHESIS
		//IF AMT OR TOTAL ARE INT THEN DO AMT=READER.NEXTINT();
		
		
		//reader.nextDouble waits until double there to assign to amt which is memory location
		//amt will hold number being entered because left gets what is in right
		//= is the assignment operator
		//amt now has 20.5 before it goes onto the end
		total=amt*2; //find amt then multiplies by two then assigns to total
		System.out.print("Here is the number doubled: "); //no enter
		System.out.println(total);
		System.out.print("The end");
		//because we declared these variables as doubles, it makes it a double and adds .0
		//OR i can make double total=12; ...variables erased after running
		
		//GET INTO HABBIT OF GIVING VARIABLES NUMBER LIKE 0... double amt=0;
	}

}