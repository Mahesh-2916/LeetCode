class Solution {
    public int maximumDifference(int[] nums) {
        int b = Integer.MAX_VALUE;
        int maxDiff = -1;

        for(int i = 0; i<nums.length; i++){
            if(b < nums[i]){
                int p = nums[i] - b;
                maxDiff = Math.max(maxDiff, p);
            }
            else{
                b = nums[i];
            }
        }
        return maxDiff;
    }
}