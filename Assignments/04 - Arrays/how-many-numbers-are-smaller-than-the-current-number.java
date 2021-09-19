class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(nums[i] > nums[j] && i != j){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
