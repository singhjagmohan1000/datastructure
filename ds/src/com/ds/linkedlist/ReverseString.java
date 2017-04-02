package com.ds.linkedlist;


import java.util.Stack;

/**
 * Created by gaggi on 4/1/17.
 * Space Complexity O(n).
 * Time Complexity O(n).
 */
public class ReverseString {

    Stack stack = new Stack();

    public String reverse(String str){
        char[] ch = str.toCharArray();
        for (char ch1: str.toCharArray()){
            stack.push(ch1);

        }

        for(int i=0;i<str.length();i++){
            ch[i]=(char)stack.pop();
        }
        return new String(ch);

    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str1 = "avaj";
        String str2 = reverseString.reverse(str1);
        System.out.println(str2);
    }
}
