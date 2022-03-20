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
        String s = "){";
        System.out.println(isValid(s));
    }

        public static boolean isValid(String s) {

        char[] charArray = s.toCharArray();
        if(charArray.length%2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for(char charValue:charArray){

            if(stack.isEmpty()){
                stack.push((Character)charValue);
            }

            else if( ((Character)charValue).toString().equalsIgnoreCase("]") &&
                    stack.peek().toString().equalsIgnoreCase("[")){
                stack.pop();
            }
            else if( ((Character)charValue).toString().equalsIgnoreCase("}") &&
                    stack.peek().toString().equalsIgnoreCase("{")){
                stack.pop();
            }
            else if( ((Character)charValue).toString().equalsIgnoreCase(")") &&
                    stack.peek().toString().equalsIgnoreCase("(")){
                stack.pop();
            }
            else
                stack.push((Character)charValue);

        }


        return stack.isEmpty();
        }

}
