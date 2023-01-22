import java.util.Scanner;

public class CandyMachine
{
	
  public static void main(String[] args)
  {   
	Scanner reader= new Scanner(System.in);  
	CashRegister cashRegister = new CashRegister(); 
	Dispenser candy = new Dispenser(100, 50); 
	Dispenser chips = new Dispenser(100, 65); 
	Dispenser gum = new Dispenser(75, 45); 
	Dispenser cookies = new Dispenser(100, 85);
	
	int choice=-1;
	showSelection();
	choice=reader.nextInt();
	while (choice != 9) 
		{
		switch (choice) 
		{
		case 1:
		sellProduct(candy, cashRegister, reader);
		break;
		case 2:
		sellProduct(chips, cashRegister, reader);
		break;
		case 3:
		sellProduct(gum, cashRegister, reader);
		break;
		case 4:
		sellProduct(cookies, cashRegister, reader);
		break;
		default:
		System.out.println("Invalid Selection");
		}
		showSelection(); 
		choice =reader.nextInt(); 
		
		}
  }
 
  
  public static void showSelection()
  {
  System.out.println("*** Welcome to Chava's Candy Shop ***");
  System.out.println("To select an item, enter ");
  System.out.println("1 for Candy");
  System.out.println("2 for Chips");
  System.out.println("3 for Gum ");
  System.out.println("4 for Cookies");
  System.out.println("9 to exit");}
  
  public static void sellProduct(Dispenser product, CashRegister cRegister, Scanner reader)
  {
    if(product.getCount() <= 0)
    {
     	System.out.println("Sorry, this item is out of stock.\n");
    }
    
    if(product.getCount() > 0) //need if loop?
    {
    int cost=product.getProductCost();
    int amountPassed=0;
    while(amountPassed<cost) {
    System.out.println("Please deposit "+(cost-amountPassed)+" cents: ");
    amountPassed+= reader.nextInt();
    cRegister.acceptAmount(amountPassed);}
 
    product.makeSale();
    }
  }
   
}