import java.util.Scanner;

import javax.swing.JOptionPane;
public class B_tickets {
	
	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter stop to terminate program at any time.");
		System.out.println("Enter ticket number: ");
		String ticket= reader.next();
		while (!(ticket.equals("stop"))) 
		{
			if ((ticket.length()==6))
				{String ticket1 = ticket.substring(0,5);
			
				String lastNum= ticket.substring(5);

				int ticketnumb=Integer.parseInt(ticket1);
				int lastNumnumb=Integer.parseInt(lastNum);
				int remainder=ticketnumb%7;
				boolean x= (lastNumnumb==remainder);
				JOptionPane.showMessageDialog(null, x);
				System.out.println("Enter ticket number: ");
				ticket= reader.next();
				}
			else 
			{System.out.println("Invalid ticket number.");
			System.out.println("\nEnter ticket number: ");
			ticket= reader.next();
			
			}
			

		
		}

		
	}

}
