/** 5] Write a java Program to display the pattern using the alphabet. */

class Q5
{
	public static void main(String args[])
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			char a=65;
			for(j=n;j>=i;j--)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}