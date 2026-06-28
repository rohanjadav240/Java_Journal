//8. Write a program that will accept a string from commandline and arrange all the characters in alphabetical order.
//E.g. inputcomputer
//outputcemoprtu

import java.util.Arrays;

class SortString {
    public static void main(String args[]) {

        String str = args[0];              // command line input
        char ch[] = str.toCharArray();     // convert string to char array

        Arrays.sort(ch);                   // sort characters alphabetically

        String result = new String(ch);    // convert back to string
        System.out.println("Output: " + result);
    }
}