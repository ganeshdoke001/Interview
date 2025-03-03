package com.codeq.techm;

/*
 * 20. Valid Parentheses
 */
public class Valid_Parentheses {

    public static void main(
            String arg[]) {

        String s = "()";
        System.out.println(validParenthesis(s));
    }

    public static boolean validParenthesis(
            String s) {

        while (true) {
            String str = s.replace("()", "")
                    .replace("{}", "")
                    .replace("[]", "");
            if (str.equals(s)) {
                break;
            }
            s = str;
        }
        return s.isEmpty();

    }
}
