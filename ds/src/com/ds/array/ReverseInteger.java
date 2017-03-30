package com.ds.array;

/**
 * Created by gaggi on 3/30/17.
 */
public class ReverseInteger {


    public int reverseInteger(int num){
        long rev = 0;
        while (num >0){
            rev = rev * 10 + num %10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
            num = num/10;
        }
        return (int) rev;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverseInteger(242423));

    }
}
