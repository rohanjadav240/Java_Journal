/** 2] Write a Program In java to Display the pattern like Reverse Right Half Pyramid pattern
using while loop. */

class Q2{
    public static void main(String args[]){
        int i=1,j,n=5;
        while(i<=n){
            j=n;
            while(j>=i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}



