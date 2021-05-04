package javaPrograms;


public class ChangeOddIndexToUpperCase {

	public static void main(String[] args)
	{
		  String test = "changeme";
		 
		 
		  char[] c=test.toCharArray();  
		  
		  System.out.println("Odd Index Of changeme: ");
		  for(int i=0;i<c.length;i++)
		   {
			
			if(i%2==1)
	    	  {
			    System.out.println("Array["+i+"] = "+c[i]);
	    	  }
		  } 
		  System.out.print("Uppercase Of Odd Index(changeme) : ");
		  for(int j=0;j<c.length;j++)
		   {
			
			if(j%2==0)
	    	  {
				char u=c[j];
	    		char uc=Character.toLowerCase(u);
	    	    System.out.print(uc);
	    	  }
			else
			{
				char u=c[j];
	    		char uc=Character.toUpperCase(u);
	    		System.out.print(uc);
			}
			
		  } 
	    } 
	}
		
		/* String s ="ChangeMe";
		s = s.toLowerCase();
		System.out.println(s);
		//to convert the string to char array
		char[] ch = s.toCharArray();
		//control
		for (int i = 0; i < ch.length; i=i+2) {
			ch[i] = Character.toUpperCase(ch[i]);
					}
		System.out.println(ch); */

	


