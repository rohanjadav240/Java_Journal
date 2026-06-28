class MyExc extends Exception
{
	MyExc(String msg)
	{
		super(msg);		
	}

}

class UE
{
	public static void main (String args[])
	{
		if (args.length==0)
		{
			System.out.println("Please Enter A Number");
			return;
		}
		try
		{
			String num = args[0];
			if(num.length()%2!=0)
			{
				throw new MyExc("Number is Odd Digit");
			}	
			System.out.println("Number Is Even Digits");
		}
		catch(MyExc e)
		{
			System.out.println(e.getMessage());
		}
	}
}