/** 14. Write a program to check given string is Palindrome or not. */

class Q14
{
	public static void main (String args[])
	{
		int num=Integer.parseInt(args[0]);
		int dup=num,rev=0,a;
		while(dup>0)
		{
			a=dup%10;
			rev=rev*10+a;
			dup=dup/10;
		}
		if (rev==num)
		{
			System.out.print(num+" Is A Palindrome Number");
		}
		else
		{
			System.out.print(num+" Is Not A Palindrome Number");
		}
	}
}