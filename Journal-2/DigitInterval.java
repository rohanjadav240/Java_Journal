//1. Write a program that accept a number from commandline and display individual digits on the interval of 10 seconds.

class DigitInterval {
    public static void main(String args[]) {
        
        // Check if argument is provided
        if(args.length == 0) {
            System.out.println("Please provide a number in command line.");
            return;
        }

        String num = args[0];  // number from command line

        try {
            for(int i = 0; i < num.length(); i++) {
                System.out.println("Digit: " + num.charAt(i));
                
                // wait for 10 seconds (10000 milliseconds)
                Thread.sleep(10000);
            }
        } 
        catch(InterruptedException e) {
            System.out.println("Error: " + e);
        }
    }
}