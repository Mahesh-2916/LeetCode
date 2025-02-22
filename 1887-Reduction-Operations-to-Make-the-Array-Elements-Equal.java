class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int operations = 0;
        int prevUnique = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == prevUnique) continue;

            if (nums[i] < prevUnique) {
                operations += nums.length - 1 - i;
            }

            prevUnique = nums[i];
        }

        return operations;        
    }
}