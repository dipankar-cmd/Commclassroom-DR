package com.company;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2*n];

            for(int i = 0; i<2*n; i++){
                if(i<n){
                    ans[i] = nums[i];
                }

                if(i>=n){
                    ans[i] = nums [i - n];
                }
            }

            return ans;
        }
}

