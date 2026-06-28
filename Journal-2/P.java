interface Area
{
	void calculate(int a, int b);
}

class a implements Area
{
	public void calculate(int a,int b)
	{
		System.out.print(a+b);
	}
}
class P
{
	public static void main(String args[])
	{
		Area c = new a();
		c.calculate(5,6);
	}
}