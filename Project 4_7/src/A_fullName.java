import java.util.Scanner;

public class A_fullName {
	public static void main(String[] args) {
		System.out.println("Please type stop to stop at any time: ");
		System.out.println("Enter full name: ");
		Scanner a=new Scanner(System.in);
		String full=a.nextLine();
		int count=0;
		String middle="";
		
		while (!(full.equals("stop")))
			{
			int firstSpace=full.indexOf(" ");
			int lastSpace=full.lastIndexOf(" ");
			String first=full.substring(0, 1).toUpperCase()+full.substring(1, firstSpace);
			String last=full.substring(lastSpace+1, lastSpace+2).toUpperCase()
					+full.substring(lastSpace+2, full.length());
			
			//String middle="";
			
			if (!(firstSpace==lastSpace))
				{
				String middle2=full.substring(firstSpace+1, lastSpace);
				if (full.indexOf(" ", firstSpace+1)!=lastSpace)
					{
					int midSpace1=middle2.indexOf(" ");
					int midSpace2=middle2.indexOf(" ", midSpace1);
					String mid1=middle2.substring(0, 1).toUpperCase()+middle2.substring(1, midSpace1+1);
					String mid2=middle2.substring(midSpace1+1, midSpace1+2).toUpperCase()
							+middle2.substring(midSpace2+2, middle2.length());
					middle+=mid1+mid2+" ";
					}
				else
					middle=" "+middle2.substring(0, 1).toUpperCase()+middle2.substring(1, middle2.length())+" ";}
			
			else
				middle=" ";
			System.out.println("Your full name is "+first+middle+last+".");
			System.out.println("\nYour first name is "+first+".");
			System.out.println("\nYour last name is "+last+".");
			if (!(middle==" "))
				System.out.println("\n Your middle name(s) is/are "+middle+".");
			System.out.print("\nEnter your full name or stop: ");
			full=a.nextLine();
			count++;}
				//System.out.println("\nThere are "+count+" people in your list.");a.close();
	
		}
}