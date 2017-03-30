package com.ds.array;

/**
 * Created by gaggi on 3/29/17.
 */
public class UniqueString {

    /**
     * This function will store vallue of 256 ascii character in boolean array as false
     * then ascii value of each character is stored into variable name val
     * then i check in the boolean array if index of that values is already true this means, that character occured earlier
     * else in boolean that index values is set to ture... Happy Solution O(n)

     */
    boolean uniqueString(String  checkString){
        boolean []charValue = new boolean[256];
        for( int i=0;i<checkString.length();i++){
           int val = checkString.charAt(i);
           if(charValue[val]) return false;
           charValue[val]=true;

        }
        return true;

    }

    public static void main(String[] args) {
        UniqueString uniqueString = new UniqueString();
        System.out.println(uniqueString.uniqueString("saanki"));
    }
}
