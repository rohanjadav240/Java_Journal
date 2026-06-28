class EO
{
	public static void main(String args[]) throws Exception
	{	
		if (args.length==0)
		{
			System.out.print("Please Input A Number");
			return;
		}
		int num = Integer.parseInt(args[0]);
		
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" Is Even");
			}
			else
			{
				System.out.println(i+" Is Odd");
			}
			Thread.sleep(1000);
		}
	}
}