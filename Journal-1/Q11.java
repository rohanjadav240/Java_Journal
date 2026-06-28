/** 11. Write a program to take command line input and find the Character Is Vowel or Not. */

class Q11{
	public static void main(String args[])
	{
		char ch=args[0].charAt(0);
		
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
            System.out.println("The character '" + ch + "' is a Vowel.");
        } 
        else if ((ch>='a' && ch<='z')) 
		{
            System.out.println("The character '" + ch + "' is Not a Vowel (Consonant).");
        } 
        else 
		{
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
	}
}

