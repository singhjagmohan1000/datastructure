package com.algorithms.strings;

/**
 * Created by gaggi on 5/21/17.
 */
public class KMPAlgo {

    public static int f[] = new int[10];

    /**
     * Find Prefix table with this method
     * @param p
     * @param m
     */
    public static void prefixTable(String p,int m){
        int i=1,j=0;
        f[0]=0;
        while(i<m){
            if(p.charAt(i)==p.charAt(j)){
                f[i]=j+1;
                i++;
                j++;
            }
            else if(j>0)
                    j=f[j-1];
            else{
                f[i]=0;
                i++;
            }
        }

    }
    public static int kmp(String s, String p){
        int i=0,j=0,m=p.length(),n=s.length();
        prefixTable(p,m);
        while(i<n){
            if(s.charAt(i)==p.charAt(j)){
                if(j==m-1)
                    return i-j;
                else
                {
                    i++;
                    j++;
                }
            }
            else if(j>0)
                j=f[j-1];
            else
                i++;
        }

        return -1;
    }

    public static void main(String args[]){

        String s = args[0];
        String p = args[1];
        System.out.println("Pattern starting index is: "+kmp(s,p));

    }
}
