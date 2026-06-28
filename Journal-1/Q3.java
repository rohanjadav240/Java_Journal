/** 3] Write a program in java to make such a pattern like a pyramid with numbers increased
by 1. */

class Q3
{
	public static void main(String args[])
	{
		int n=4, a=1, i, j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}
