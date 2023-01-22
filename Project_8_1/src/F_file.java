import java.io.*;
import java.util.*;
public class F_file {

	public static void main(String[] args)throws FileNotFoundException { 
		Scanner reader= new Scanner(System.in);
		Scanner inFile=new Scanner (new FileReader("U:\\Phone List.txt"));
		int x=0;
		while (inFile.hasNext())
		{
			inFile.nextLine();
			x++;

		}
		//System.out.println("x" + x);
		String [][] info=new String[x][3];
		String[] firstName= new String[x];
		String[] lastName= new String[x];
		String[] phoneNumber= new String[x];

		

		Scanner inFile1=new Scanner (new FileReader("U:\\Phone List.txt"));
		for(int i=0; i<x;i++)
		{
			
			for(int j=0; j<info[0].length;j++)
			{
				info[i][j]=inFile1.next();
				System.out.print(info[i][j]+" ");
			}
			System.out.println(" ");
		
		}
		for(int i=0; i<x;i++)
		{
			firstName[i]=info[i][0];
			lastName[i]=info[i][1];
			phoneNumber[i]=info[i][2];
		}
		System.out.println("\nDo you want to search by first name, last name, or phone number: ");
		String response= reader.nextLine();
		
		boolean foundflag= false;
		int i=0;
		String fresponse="";	
		if (response.equals("first name"))
		{
			System.out.println("Enter first name: ");
			fresponse=reader.nextLine();
		
			while (foundflag==false && i<x)
			{

				if (firstName[i].equals(fresponse))
				{
				System.out.println("Last Name: "+lastName[i]);
				System.out.println("Phone number: "+phoneNumber[i]);
				foundflag= true;
				}
				i++;
			}
		}
		String lresponse="";		
		if (response.equals("last name"))
		{
			System.out.println("Enter last name: ");
			lresponse=reader.nextLine();
			
			while (foundflag==false && i<x)
			{

				if (lastName[i].equals(lresponse))
				{
				System.out.println("First name: "+firstName[i]);
				System.out.println("Phone number: "+phoneNumber[i]);
				foundflag= true;
				}
				i++;
			}
		}
		//x is i then not found
		String presponse="";	
		if (response.equals("phone number"))
		{
			System.out.println("Enter phone number: ");
			presponse=reader.nextLine();
		
			while (foundflag==false && i<x)
			{
				if (phoneNumber[i].equals(presponse))
				{
				System.out.println("First name: "+firstName[i]);
				System.out.println("Last name: "+lastName[i]);
				foundflag= true;
				}
				i++;
			}
		}
		if(foundflag=false)
			System.out.println("Sorry we couldn't find your request.");

		inFile.close();



	}}
