//2. Write a program to print Even and odd numbers in the interval of 1 second.

class EvenOddInterval {
    public static void main(String args[]) {

        int n = Integer.parseInt(args[0]);  // command line input

        try {
            for(int i = 1; i <= n; i++) {

                if(i % 2 == 0)
                    System.out.println(i + " Even");
                else
                    System.out.println(i + " Odd");

                Thread.sleep(1000);   // 1 second delay
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}