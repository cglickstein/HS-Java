import java.util.Scanner;
public class CG_Project_Assignment {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		
		for (int counter=1; counter<=num; counter++)
		{
			int x=1;
			String i="";
			while (x<=counter)
				if (counter%x==0)
				{	
					String xString=""+x+" ";
					i=i+xString;
					x++;
				}
				else 
					x++;
			System.out.println("\n"+counter+" is evenly divisible by "+i);
			

		}

	}

}