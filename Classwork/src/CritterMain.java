import java.util.Scanner;

public class CritterMain {

	public static void main(String[] args) {
		//instantiating
		Critter crit1= new Critter("Poochie","happy");
		Critter crit2= new Critter("Randolph");
		/*int t=crit1.getTotal();
		System.out.println("t "+t);
		int t2=crit1.getTotal();
		System.out.println("t2 "+t2);
		int t3=Critter.getTotal(); //works for whole class because static!
		crit1.talk();
		crit2.talk();
		//can't have overall Critter.talk
		crit1.eat(5);
		System.out.println(crit1);*/
		Scanner reader= new Scanner (System.in);
		System.out.println("What would you like to name your critter?");
		String name=reader.nextLine();
		
		Critter Crit1= new Critter (name);
		
		int choice=50;
		while (choice!=0)
		{
			System.out.println("Critter caretaker");
			System.out.println("0-Quit");
			System.out.println("1-Listen to your critter");
			System.out.println("2-Feed your critter");
			System.out.println("3- Play with your critter");
			
			choice=reader.nextInt();
			System.out.println();
			
			if (choice==0)
				System.out.println("Good bye");
			else if (choice==1)
				crit1.talk();
			else if (choice==2)
				crit1.eat(4);
			else if (choice==3)
				crit1.play(3);
			else 
				System.out.println();
		}
	}

}
