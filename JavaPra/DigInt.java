class DigInt
{
	public static void main(String args[]) throws Exception
	{
		if (args.length==0)
		{
			System.out.print("Please Input A Number");
			return;
		}
		String num = args[0];
		
		for(int i=0; i<num.length(); i++)
		{
			System.out.println(num.charAt(i));
			Thread.sleep(1000);
		}
		
	}
}