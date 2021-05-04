package javaPrograms;

/* FibanocciSeries 
 * input(range): 8 
 * output: 0, 1, 1, 2, 3, 5, 8, 13
 */

public class FibanocciSeries {

	public static void main(String[] args) 
	{
		
		int fnum=0,snum=1,sum;
		System.out.println("Input (Range): 8");
		System.out.print(fnum +" " +snum);
		for(int i=1;i<=8;i++)
		{
		    sum=fnum+snum;
		    System.out.print(" " +sum);
		    fnum=snum;
		    snum=sum;
		}
		
	}

}
