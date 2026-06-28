	/** 1] Write a Program In java to Display the pattern like Right Half Pyramid pattern using for
loop. 
class Q1 
{
    public static void main(String args[])
	{
        int n=5,i,j;
        for (i=1;i<=n;i++) 
		{
            for (j=1;j<=i;j++) 
			{
				System.out.print("*");
            }
            System.out.println();
        }
    }
}**/

class Q1{
    public static void main(String[] a){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) 
			System.out.print("*");
            System.out.println();
        }
    }
}
