package com.ds.array;

import java.util.HashMap;

/**
 * Created by gaggi on 3/30/17.
 */
public class TwoSum {

public int[] twoSum(int[] nums,int target){
    HashMap<Integer,Integer> hashMap= new HashMap();
    for(int i=0;i<nums.length;i++){

        int b= target-nums[i];
        if(hashMap.containsKey(b)){
          return  new int[]{i, hashMap.get(b)};
        }
        hashMap.put(nums[i],i);
    }

    return nums;
}

    public static void main(String[] args) {
        TwoSum twoSum= new TwoSum();
        int indices[] = new int[2];
        int nums[]={2,7,5,11};
        indices=twoSum.twoSum(nums,7);
            for(int i=0;i<indices.length;i++)
                System.out.println(indices[i]);

    }

}
