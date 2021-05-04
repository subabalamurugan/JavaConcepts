package javaPrograms;

/* Input  : I am a software tester 
 * Output : I ma a erawtfos tester
 */
public class RevEvenWords {

	public static void main(String[] args) 
	{
		String input="I am a software tester ";
		String[] s=input.split(" ");
		System.out.println("Input  : I am a software tester ");
		for(int i=0;i<s.length;i++)
		  {
			if(i%2==0)
			{
		      System.out.print(" ");
			  System.out.print(s[i]);
			}
			else if(i%2==1)
	    	  {
			    
			    String r=s[i];			    
			    System.out.print(" ");
			    char[] rev = r.toCharArray();
			    
		        for (int j = rev.length - 1; j >= 0; j--)
		            System.out.print(rev[j]);		         		         
	    	  }
		  }
		}
	}
