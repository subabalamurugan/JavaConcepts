package javaPrograms;


/* Input : Madam 
 * Output : Madam string is palindrome
 */
public class PalinDrome {

	public static void main(String[] args) 
	{
		String a ="madam", rev="";
		char palin[]=a.toCharArray();
		System.out.println("Input : madam");
			for(int i=palin.length-1;i>=0;i--)
			{
				rev=rev + a.charAt(i);		
			    
			}
			
	       if(a.equals(rev))
				System.out.println("Given String is a Palindrome");
			else
				System.out.println("Given String is a not palindrome");  
			
	}

}
