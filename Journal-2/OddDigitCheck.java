//6. Write a program that will accept a number from command line and raise a user defined exception if the number consists of odd number of digits.

// User defined exception


class OddDigitCheck {
    public static void main(String args[]) {

        try {
            String num = args[0];   // number from command line
            int length = num.length();

            if(length % 2 != 0) {
                throw new OddDigitException("Number contains odd number of digits");
            }

            System.out.println("Number is valid (even number of digits)");

        } 
        catch(OddDigitException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Please enter a number");
        }
    }
}

class OddDigitException extends Exception {
    OddDigitException(String msg) {
        super(msg);
    }
}