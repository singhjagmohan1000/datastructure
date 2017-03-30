package com.ds.array;

/**
 * Created by gaggi on 3/30/17.
 */
public class Palindrome {
    public boolean palindrome(int num){

        int rev = reverseInteger(num);
        System.out.println(rev);
        if (rev == num){
            return true;
        }
        return false;
    }
   int  reverseInteger(int num){
            long rev=0;
            while(num > 0){
                rev = rev * 10 + num %10;
                if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                    return 0;
                }

                num = num/10;
            }
            return (int) rev;
    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.palindrome(Integer.MAX_VALUE));
    }
}
