/**Write a Program to take command line input and Check Year is Leap Year or Not.**/

class Q10
{
	public static void main(String args[])
	{
		int year=Integer.parseInt(args[0]);
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			System.out.print(year+" is Leap year");
		}
		else
		{
			System.out.print(year+" is not leap year");
		}
	}
}