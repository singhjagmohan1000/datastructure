package com.ds.string;

/**
 * Created by gaggi on 4/9/17.
 */
public class ReverseString {

        public String reverseWords(String s) {

            String strg[] = s.split(" ");

            StringBuilder stringBuilder = new StringBuilder();


            int count =0,mark=0;
           for( int j=0;j<strg.length;j++){

               for(int i=strg[j].length()-1;i>=0;i--){
                   stringBuilder.append(strg[j].charAt(i));
               }

                    stringBuilder.append(" ");


            }

            return stringBuilder.toString();


    }

    public static void main(String[] args) {

            ReverseString rS = new ReverseString();

            System.out.println(rS.reverseWords("Let's take LeetCode contest"));

    }
}
