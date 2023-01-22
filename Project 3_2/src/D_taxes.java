import java.util.Scanner;

public class D_taxes {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter original price of object: ");
		double price;
		price=reader.nextDouble();
		System.out.println("Enter its markup percentage: ");
		double markup;
		markup=reader.nextDouble();
		System.out.println("Enter the sales tax rate: ");
		double saleRate;
		saleRate=reader.nextDouble();
		System.out.println("Original price of item: "+ price);
		System.out.println("Marked up percentage of item:"+ markup + " Percent");
		System.out.println("Sales tax rate: "+ saleRate+" Percent");
		saleRate=saleRate/100;
		markup=markup/100;
		double sellingPrice=(price+(price*(markup))) ;
		double salesTax=(price+(price*(markup)));
		double tax=(salesTax)*saleRate; 
		double finalPrice= sellingPrice+tax; 
		
		System.out.println("The store's selling price of item: " + sellingPrice); 
		System.out.println("Sales tax: "+ tax);
		System.out.println("The final price of the item :" +finalPrice);

		

		}

}
