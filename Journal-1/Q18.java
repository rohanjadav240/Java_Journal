/** 18. Write a program to take command line input and print factorial of given number. */

import java.util.*;

class Q18
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number For Factorial : ");
		int num = s.nextInt();
		int i,j,fac=num;
		
		for (i=num-1 ; i>1 ; i--)
		{
			j=fac;
			fac = fac * i;
			System.out.println(j+"*"+i+" = "+fac);
		}
		System.out.print(num+" Final Factoriaal Is : "+fac);
	}
}