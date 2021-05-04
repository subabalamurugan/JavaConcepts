package overriding;

public class AxisBank extends BankInfo  
{
	public static void main(String[] args) 
	{
		AxisBank a =new AxisBank();
		a.deposit();
		a.savings();
		a.fixed();			
    }
	
	public void deposit()
	   {
	      System.out.println("Deposit Amount is : 35000");
	   }
}
