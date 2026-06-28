/** 17. Write a program to reverse a given number using while loop. */

import java.util.*;

class Q17
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number For Reverse : ");
		int num = s.nextInt();
		int rev=0,dup=num,d;
		
		while (dup>0)
		{
			d = dup % 10;
			rev = rev * 10 + d;
			dup/=10;
		}
		System.out.print(num+" Reverse Is : "+rev);
	}
}
