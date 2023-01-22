import java.util.Scanner;
public class Project1_CG {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		double billProcessingR=4.50;
		double basicServiceR=20.50; //one line
		double extraLineR=7.50; //per line
		double billProcessingB=15.00;
		double basicServiceB=75.00; //ten or less line
		double additionLinesB=5.00; //per line
		double premiumLineB=50.00; //per line
		
		System.out.println("Enter five digit account number: ");
		String accountNumber=reader.nextLine();
		
		//checking to see if account number is valid
		if (!(accountNumber.length()==5)) //&&
			{
			System.out.println("INVALID ACCOUNT NUMBER ");
			System.exit(0);
			}

		String first=accountNumber.substring(0,1);
		String second=accountNumber.substring(1,2);
		String third=accountNumber.substring(2,3);
		String fourth=accountNumber.substring(3,4);
		String fifth=accountNumber.substring(4,5);
		
		if(!(first.equals("1") || first.equals("2") || first.equals("3") || first.equals("4") || first.equals("5") || first.equals("6") || first.equals("7") || first.equals("8") || first.equals("9") || first.equals("0") ))
		{
			System.out.println("INVALID ACCOUNT NUMBER");
			System.exit(0);
			}
		if(!(second.equals ("1") || second.equals("2") || second.equals("3") || second=="4" || second=="5" || second=="6" || second=="7" || second=="8" || second=="9" || second=="0" ))
		{
			System.out.println("INVALID ACCOUNT NUMBER");
			System.exit(0);
			}
		if(!(third.equals ("1") || third.equals("2") || third.equals ("3")|| third.equals ("4") || third.equals ("5") || third.equals ("6") || third.equals ("7") || third.equals ("8") || third.equals("9") || third.equals("0") ))
		{
			System.out.println("INVALID ACCOUNT NUMBER");
			System.exit(0);
			}
		if(!(fourth!= "1" || fourth.equals("2") || fourth.equals("3") || fourth.equals("4") || fourth.equals("5")|| fourth.equals("6") || fourth.equals("7") || fourth.equals("8") || fourth.equals("9") || fourth.equals("0")))
		{
			System.out.println("INVALID ACCOUNT NUMBER");
			System.exit(0);
			}
		if(!(fifth.equals("1") || fifth.equals("2") || fifth.equals("3") || fifth.equals("4") || fifth.equals("5") || fifth.equals("6") || fifth.equals("7") || fifth.equals("8") || fifth.equals("9") || fifth.equals("0") ))
		{
			System.out.println("INVALID ACCOUNT NUMBER");
			System.exit(0);
			}

			System.out.println("Enter customer type (B for bussiness or R for residential): ");
		String type=reader.nextLine();

		
		switch(type)

		{
		case "r":
		case "R":
			System.out.println("Enter number of lines: ");
			int lines=reader.nextInt();
			if (lines>1)
				{lines-=1;
				System.out.println("Amount due: $"+(billProcessingR+basicServiceR+lines*extraLineR)+"0");
				}
			else
				System.out.println("Amount due: $"+(billProcessingR+basicServiceR)+"0");
			break;
		case "B":
		case "b":
			System.out.println("Enter number of basic lines: ");
			int basic=reader.nextInt();
			System.out.println("Enter number of premium lines: ");
			int premium=reader.nextInt();
			if (basic>10)
				{
				int extras=basic-10;
				System.out.println(extras);
				System.out.println("Amount due: $"+(billProcessingB+basicServiceB+(extras*additionLinesB)+(premium*premiumLineB)+"0"));
				}

			else
				System.out.println("Amount due: $"+(billProcessingB+basicServiceB+(premium*premiumLineB)+"0"));
			break;
				
		default:
			System.out.println("You entered an invalid customer type.");


	}

}
}
