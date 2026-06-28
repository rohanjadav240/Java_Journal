/** 13. Write a program to check number is Armstrong or Not. */

class Q13
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int dup=num,sum=0,r;
		
		while(dup>0)
		{
			r=dup%10;
			sum=sum+(r*r*r);
			dup=dup/10;
		}
		if (num==sum)
		{
		System.out.print("Yes");
		}
		else
		{
		System.out.print("No");
		}
	}
}