import java.util.Scanner;

public class D_votes {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		String[] canidates= new String[5]; 
		int [] votes= new int [5];
		double [] percentage= new double [5];
		
		for (int i=0; i<5;i++ ) //start i with 0 because 0th element WHILE then
		{
			System.out.println("Enter canidate's last name: ");
			canidates[i]= reader.nextLine();
			System.out.println("Enter the number of for canidate "+canidates[i]);
			votes[i]=reader.nextInt();
			reader.nextLine();
			//rain[i]=reader.nextDouble();
		}
		
		double sumVotes=0;
		for(int j=0; j<5;j++)
		{
			sumVotes+=votes[j];
		}
		
		for(int h=0; h<5;h++)
		{
			percentage[h]=(votes[h]/sumVotes)*100;
			percentage[h]=(Math.round(percentage[h]));
		}
		
		
		for (int i=0; i<5;i++)
		{
			System.out.println("Canidate: "+canidates[i]);
			System.out.println("Votes: "+votes[i]);
			System.out.println("% of Total votes : "+percentage[i]);
			System.out.println("=======================");
		}
		
		double max=0;
		int index=-1;
		String winner="";
		for (int i=0;i<5;i++)
		{
			if (percentage[i]>max)
			{
				max=percentage[i];
				index=i;
				winner=canidates[i];


			}
		}
		System.out.println("The winner is: "+winner);
		
	}}
