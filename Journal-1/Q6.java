/** 6] Write a Program In java to Display the pattern like Diamond Shape Pyramid pattern */

class Q6
{
	public static void main(String args[])
	{
		int n=5,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>i;j--)
			System.out.print(" ");
			for(j=1;j<=i;j++)
			System.out.print("* ");
			System.out.println();
		}
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=i;j++)
			System.out.print(" ");
			for(j=n-i;j>=1;j--)
			System.out.print("* ");
			System.out.println();
		}
	}
}