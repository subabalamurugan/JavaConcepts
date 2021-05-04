package javaPrograms;

/* Input : Array 1  : {3,2,11,4,6,7}
 *         Array 2  : {1,2,8,4,9,7}
 * 
 * Output - 2,4,7 */


public class InterSection {

	public static void main(String[] args) 
	{
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		System.out.println("Input");
		System.out.println("Array 1  : {3,2,11,4,6,7}");
		System.out.println("Array 2  : {1,2,8,4,9,7}");
		System.out.print("Intersection values : { ");
		for(int i=0;i<a.length;i++)
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
				 {					
                    System.out.print(+a[i]+",");
				 }                     			
		System.out.print("}");      
	    }
	}
