/** 15] Write a to check number is Prime number or not. */
import java.util.*;

class Q15
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num = s.nextInt();
		int c=0;
		for (int i=2; i<=num/2; i++)
		{
			if (num%i==0)
			{
				c = 1;
			}
		}
		if (c==1)
		{
			System.out.print(num+" Is Not A Prime Number");
		}
		else
		{
			System.out.print(num+" Is A Prime Number");
		}
	}
}