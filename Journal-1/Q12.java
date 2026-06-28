/** 12. Write a program to take command line input and calculate a Simple Interest. */

class Q12
{
	public static void main(String args[])
	{
		double p=Double.parseDouble(args[0]);
        double r=Double.parseDouble(args[1]);
        double t=Double.parseDouble(args[2]);
        double si = (p * r * t) / 100;

        System.out.println("Principal : " + p);
        System.out.println("Rate      : " + r);
        System.out.println("Time      : " + t);
        System.out.println("Simple Interest is :  " + si);
	}
}