// 5. Write a program that will accept two strings or two numbers from command line and create overloaded method that add these two numbers or concate two strings.

class OverloadDemo {

    // Overloaded method for integers
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Overloaded method for strings
    void add(String a, String b) {
        System.out.println("Concatenation = " + a + b);
    }

    public static void main(String args[]) {

        OverloadDemo obj = new OverloadDemo();

        int sum = 0;
        String concat = "";

        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                sum += num;
            } catch (Exception e) {
                concat += args[i];
            }
        }

        obj.add(sum, 0);      // print sum
        obj.add(concat, "");  // print concatenation
    }
}