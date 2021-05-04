package polymorphism;

public class Calculator 
{
	public int add(int a,int b)
	{
		 return a+b;	
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;	
	}
	public int multiply(int a,int b)
	{
		 return a*b;	
	}
	public double multiply(int a,double b)
	{
		 return a*b;		
	}
	public int subtract(int a,int b)
	{
		 return a-b;	
	}
	public double subtract(double a,double b)
	{
		 return a-b;		
	}
	public int division(int a,int b)
	{
		 return a-b;	
	}
	public double division(double a,int b)
	{
		 return a-b;		
	}
	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		//Addition
		int sum=c.add(23,27);
		System.out.println("Two Number addition :"+sum);
		int sum1=c.add(23, 27, 25);	
		System.out.println("Three Number addition :"+sum1);
		//Multiply
		int mul1=c.multiply(9,5);
		System.out.println("Multiply of Two numbers :"+mul1);
		double mul2=c.multiply(9,45655565);
		System.out.println("Multiply of Two numbers :"+mul2);
		//Subtraction
		int sub=c.subtract(10,5);
		System.out.println("Subtraction of Two numbers :"+sub);
		double sub1=c.subtract(9000000,400000);
		System.out.println("Subtraction of Two numbers :"+sub1);
       //Division
		int div=c.division(100,5);
		System.out.println("Division of Two numbers :"+div);
		double div1=c.division(1000000,500);
		System.out.println("Division of Two numbers :"+div1);
	}

}
