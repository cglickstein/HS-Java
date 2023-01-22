public class CashRegister
{
    private int cashOnHand;
 
        //Default constructor
    public CashRegister()
    {
        cashOnHand = 500;
    }
 
        //Constructor with parameters
    public CashRegister(int cashPassed)
    {
       if (cashPassed >= 0)
       {
             cashOnHand = cashPassed;
       }
       else
       {
          cashOnHand = 500;
        }
    }
 
        //current amount in the cash register
    public int currentBalance()
    {
         return cashOnHand;
    }
 
        //Recieves amount deposited
    public void acceptAmount(int amountPassed)
    {
       // if(amountIn <= 0)
      //  {
       //  throw new RuntimeException("The amount going into the register must be greater than zero.");
      //  }
       // else
        //{
            cashOnHand+=amountPassed;
        //}
    }
}