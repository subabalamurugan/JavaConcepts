package javaPrograms;

public class StringToChar 
{

	public static void main(String[] args)
	{
		String test = "changeme";
		  /* a) Convert the String to character array*/
		  
		  System.out.println("Convert The String To Character Array ");
		  char[] c=test.toCharArray();		  
		  for(int i=0;i<c.length;i++)
		  {
			  System.out.println("Array["+i+"] = "+c[i]);
		  } 
		  
		 /* b) Traverse through each character (using loop)*/
		 
		  System.out.println("Traverse through each character (using loop)");
		  for(int j=0;j<c.length;j++)
		  {
			  char t=test.charAt(j);
			  System.out.print(t+",");
		  }
	 }
	}

