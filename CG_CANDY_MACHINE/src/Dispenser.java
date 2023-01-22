public class Dispenser
{
    private int numberOfItems;   
    private int cost;   
 
        //Default constructor
    public Dispenser()
    {
         numberOfItems = 50;
         cost = 50;
    }
 
        //Constructor with parameters
    public Dispenser(int numberItemsPassed, int costPassed)
    {
         if (numberItemsPassed < 0)
         {
             numberOfItems=50;
         }
         else
         {
             numberOfItems = numberItemsPassed;
         }
 
         if (costPassed < 0)
         {
             cost=50;
         }
         else
         {
              cost = costPassed;
         }
    }
 
        //number of items in the dispenser 
    public int getCount()
    {
         return numberOfItems;
    }
 
        //cost of the item
    public int getProductCost()
    {
         return cost;
    }
 
        //Subtracts the number of items by one
    public void makeSale()
    {
        numberOfItems--;
        System.out.println("\nCollect your item at the bottom and enjoy!\n");
    }
}