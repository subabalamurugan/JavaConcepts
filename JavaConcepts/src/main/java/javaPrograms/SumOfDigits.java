package javaPrograms;

/* Sum Of Digits
 * input: 123
   output: 1+2+3 = 6 */


public class SumOfDigits {

	public static void main(String[] args)
    {
		
		int sum=0,a,n=123;
		
		System.out.println("Input : 123");
		while(n>0)
		{
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
         System.out.print("Sum Of Digits :"+sum);
	}

}
