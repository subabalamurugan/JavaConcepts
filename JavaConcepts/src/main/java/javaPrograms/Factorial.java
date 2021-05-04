package javaPrograms;

/*    Factorail of Number
      input: 5
	  output: 5*4*3*2*1 = 120
 */


public class Factorial {

	public static void main(String[] args) 
	{
		int i,f=1;
		int n=5;
		System.out.println("Input : 5");
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
       System.out.println("Factorial of given Number is :"+f); 
	}

}
