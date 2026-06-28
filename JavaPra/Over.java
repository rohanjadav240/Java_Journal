class Over
{
	static void add(int a,int b)
	{
		System.out.println(a +"+"+b+" = "+(a+b));
	}
	static void add(String a, String b)
	{
		System.out.println(a+b);
	}
	public static void main(String args[])
	{
		if(args.length<2)
		{
			System.out.print("Please Enter Two Value");
			return;
		}
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			add(a,b);
		}
		catch(Exception e)
		{
			add(args[0],args[1]);
		}
	}
}