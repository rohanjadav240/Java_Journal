/** 4] Write a Program In java to Display the pattern like left Half Pyramid pattern using dowhile loop. 

class Q4
{
	public static void main(String args[])
	{
		int n=5,i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
} */

class Q4{
    public static void main(String args[]){
        int i=1,n=5;
        do{
            int s=1;
            do{
                System.out.print(" ");
                s++;
            }while(s<=n-i);

            int j=1;
            do{
                System.out.print("*");
                j++;
            }while(j<=i);

            System.out.println();
            i++;
        }while(i<=n);
    }
}
