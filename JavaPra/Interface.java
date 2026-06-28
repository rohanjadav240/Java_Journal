interface Area
{
	void calculate();
}

class Triangle implements Area
{
	int a=5,b=5;
	public void calculate()
	{
		System.out.println("Hello "+a*b);
	}
	
}
class Main
{
	public static void main(String args[])
	{
		Triangle a = new Triangle();
		a.calculate();
	}
}