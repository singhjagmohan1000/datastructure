package com.ds.linkedlist;
import java.util.Stack;

/**
 * Created by gaggi on 4/2/17.
 */
public class BalanceParanthesis {

    Stack stack = new Stack();

    public boolean checkBalance(String str){

        for(char ch: str.toCharArray()){
            if(ch=='('|| ch =='{' || ch=='['){
                stack.push(ch);
            }
            else if ((ch == ']' || ch == '}' || ch == ')')
                    && (!stack.isEmpty())) {
                if (((char) stack.peek() == '(' && ch == ')')
                        || ((char) stack.peek() == '{' && ch == '}')
                        || ((char) stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                if ((ch == ']' || ch == '}' || ch == ')')) {
                    return false;
                }
            }

        }


        return stack.empty() ? true : false;
    }

    public static void main(String[] args) {
        BalanceParanthesis balanceParanthesis = new BalanceParanthesis();
        System.out.println(balanceParanthesis.checkBalance("[](){}aa"));
    }
}
