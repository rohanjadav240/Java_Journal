/** 16] Write a program to reverse a given number using for loop. */

import java.util.*;

class Q16
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num = s.nextInt();
		int rev=0,dup=num,d;
		for (; dup>0 ; dup/=10)
		{
			d = dup % 10;
			rev = (rev * 10) + d;
		}
		System.out.print(num+" Reverse Is : "+rev);
	}
}