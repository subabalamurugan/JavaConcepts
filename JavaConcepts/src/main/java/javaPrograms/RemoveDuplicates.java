package javaPrograms;
/*Input : 
 *  "We learn java basics as part of java sessions in java week1";
 *
 *Output :"We learn java basics as part of sessions in week1";
 */

public class RemoveDuplicates
{

	public static void main(String[] args) 
	{
		 String string = "we learn java basics as part of java sessions in java week1";  
	             
	        String r[] = string.split(" ");           
	        int count=1;	       
	        for(int i = 0; i < r.length; i++)
	        {  
	            count = 1;  
	            for(int j = i+1; j < r.length; j++) 
	            {  
	                if(r[i].equals(r[j])) 
	                {  	                	 
	                	count++;  	                   
	                    r[j]="";	                    
	                }  	               
	            }  	             
	            
	            System.out.print(r[i]+" ");    
	        }
	    }       
}
