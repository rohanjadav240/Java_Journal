/**Write a program to take command line input and check number is odd or even.**/

class Q9
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		if (num%2==0)
		{
			if(num==0)
			{
				System.out.print(num+" is Zero");
			}
			else
			{
				System.out.print(num+" is Even");
			}
		}
		else
		{
			System.out.print(num+" is Odd");
		}
	}
}
