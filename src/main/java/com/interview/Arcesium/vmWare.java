package com.interview.Arcesium;

import java.util.EmptyStackException;
import java.util.Stack;

public class vmWare {


    public static String checkBal(String exp){

        String status = "Not Balanced";

        if(exp.length() % 2 != 0){
            return status;
        }

        //[](){}

        Stack<Character> stack = new Stack<>();

        for(Character item : exp.trim().toCharArray()){

            try{
                if(item.toString().equals("]") && stack.peek().toString().equals( "["))
                    stack.pop();
                else if(item.toString().equals(")") && stack.peek().toString().equals( "("))
                    stack.pop();
                else if(item.toString().equals("}") && stack.peek().toString().equals( "{"))
                    stack.pop();
                else
                    stack.push(item);
            }catch(EmptyStackException e){
                stack.push(item);
            }

        }

        if(stack.isEmpty())
            status = "Balanced";

        return status;

    }

    public static void main(String[] args) {

        String exp = "[(]";
            System.out.println( checkBal(exp));
    }
}
