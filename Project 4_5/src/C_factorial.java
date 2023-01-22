import java.util.Scanner;

public class C_factorial {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter number you want factroial of: ");
		int numb= reader.nextInt();
		int x=1;
		int factorial=1;
		while (x<=numb)
			{factorial*=x;
			x+=1;
			}

System.out.println(factorial);
	}

}
                                 