/** 19. Write a program to display Fibonacci series. */

import java.util.*;

class Q19
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number For Fibonacci series : ");
		int num = s.nextInt();
		int c,d1=0,d2=1;
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(d1);
			c = d1 + d2;
			d1=d2;
			d2=c;
		}
	}
}