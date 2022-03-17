package com.bramesh.validParentheses;

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.


        Example 1:

        Input: s = "()"
        Output: true*/

import java.util.EmptyStackException;
import java.util.Stack;

public class MySolution {

    public static void main(String[] args) {
        String s = "[][(())]";
        System.out.println(isValid(s));
    }

        public static boolean isValid(String s) {

        char[] charArray= s.toCharArray();
        if(charArray.length%2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

            for(int i=0;i<charArray.length;i++) {
                char top = stack.empty() ? '#' : stack.firstElement();

                if(top == '(' && charArray[i] == ')') {
                    stack.pop();
                }else if(top == '{' && charArray[i] == '}') {
                    stack.pop();
                }else if(top == '[' && charArray[i] == ']') {
                    stack.pop();
                }else{
                    stack.push(charArray[i]);
                }
            }


            try {
                for (int i=0; i<charArray.length/2; i++){
                    if (stack.peek().toString().equals(")") && charArray[i] == '(')
                        stack.pop();
                    else if (stack.peek().toString().equals("}") && charArray[i] == '{')
                        stack.pop();
                    else if (stack.peek().toString().equals("]") && charArray[i] == '[')
                        stack.pop();
                    else
                        return false;
                }
            }catch (EmptyStackException e)
            {
                return true;
            }


        return true;
        }

}
