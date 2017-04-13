package com.ds.array;
import java.util.*;

/**
 * Created by gaggi on 4/11/17.
 */
public class Solution {

    static long[] sum(long arr[],int a,int b,int c){
        for(int i=a;i<=b;i++){
            arr[i]=arr[i]+c;
        }
        return arr;
    }
    static long largest(long arr[]){

        long max=0,x=0;

        for(int i=1;i<arr.length;i++)
        {
            x=x+arr[i];
            if(max<x) max=x;

        }

        return max;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        long arr[]=new long[i+1];
        for(int k=1;k<=j;k++){
            int a=scan.nextInt();
//                a=a-1;
            int b=scan.nextInt();
//            b=b-1;
            int c =scan.nextInt();
            arr[a]+=c;
            if((b+1)<=i) arr[b+1]-=c;

            //arr=sum(arr,a-1,b-1,c);
        }
        //System.out.print(i+"   "+j+"\n");

        System.out.println("\n"+largest(arr));
    }
}