package com.codeq.epam;

import java.math.BigInteger;

/*
 * WAP in java Big Integer multiplication, given number as String multiply them and store the result
 * as string and return. Consider edge cases such as multiplication with "-0" etc.
 */
public class StringMlti {

    public static void main(
            String arg[]) {

        System.out.println(multiplyString("45", "20"));
    }

    public static String multiplyString(
            String num1,
            String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        // Convert the strings to BigInteger objects
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);

        BigInteger res = number1.multiply(number2);
        return res.toString();
    }
}
