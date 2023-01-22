import java.util.Scanner;

public class c21 {
//parallel arrays- all same size 
	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		String[] states= new String[5]; //0,1,2,3,4
		double [] snow= new double [5];
		double [] rain= new double [5];
		
		for (int i=0; i<5;i++ ) //start i with 0 because 0th element WHILE then
		{
			System.out.println("Enter the name of state number "+(i+1));
			states[i]= reader.nextLine();
			System.out.println("Enter the amnt of the snowfall for "+states[i]);
			snow[i]=reader.nextDouble();
			System.out.println("Enter the amount of rainfall for "+states[i]);
			rain[i]=reader.nextDouble();
			reader.nextLine(); //gobble up extra enter or just next
		}
		//checking loop because if printed would give location
		for (int i=0; i<5;i++)
		{
			System.out.println("State: "+states[i]);
			System.out.println("Snow: "+snow[i]);
			System.out.println("Rain: "+rain[i]);
			System.out.println("=======================");
		}
		System.out.println("What state are u looking for? ");
		String st=reader.nextLine();
		//for(int i=0;i<5;i++)
		boolean foundflag= false;
		int i=0;
		while (foundflag==false)
		{
			if (states[i].equals(st))
			{
			System.out.println("Snow: "+snow[i]);
			System.out.println("Rain: "+rain[i]);
			foundflag= true;
			}
			i++;
		}
		
		
		double sumRain=0;
		double sumSnow=0;
		for(int j=0; j<5;j++)
		{
			sumSnow+=snow[j];
			sumRain+=rain[j];
		}
		System.out.println("Average snow: "+ (sumSnow/5));
		System.out.println("Average rain: "+ (sumRain/5));
	}

}
