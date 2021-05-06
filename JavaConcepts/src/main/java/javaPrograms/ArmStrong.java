package javaPrograms;

/*
  Armstrong
  inputs: 153
  output: (1*1*1)+(5*5*5)+(3*3*3) = 153*/

public class ArmStrong {

	public static void main(String[] args)
	{
		int s=0,a,t,n;	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		n = sc.nextInt();
		t=n;	
		while(n>0)
		{
			a=n%10;
			n=n/10;
			s=s+(a*a*a);
		}
		if(t==s)
			System.out.println("Given number is Armstrong Number");
		else
			System.out.println("Given number is Not Armstrong Number");
	}

}
