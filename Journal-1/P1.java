class P1
{
	public static void main(String ar[])
	{
		int n = Integer.parseInt(ar[0]);
		int a=0,b=1,res;
		
		for(int i=n;i>0;i--)
		{
			System.out.println(a);
			res = a+b;
			a=b;
			b=res;
		}
	}
}