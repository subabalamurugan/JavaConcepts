package javaPrograms;

import java.util.Arrays;

/*input : stops,potss
 *output : stops and potss are anagram
 */

public class Anagram {

	public static void main(String[] args) 
	{
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string1 : ");
		s1= sc.nextLine();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the string2 : ");
		s2 = sc1.nextLine();
		boolean anagram;
		if(s1.length()==s2.length())
		{
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
		    anagram=Arrays.equals(c1,c2);
		    if(anagram)
		       System.out.print(s1+" and "+s2+" are anagram");
		    else
		    	System.out.print(s1+" and  "+s2+" are not anagram");
		}
		else
			System.out.print(s1+" and "+s2+" are not anagram");

	}}
