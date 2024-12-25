class Solution {

  
    public int[] twoSum(int[] nums, int target) {

       
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        
       
        int sizeOfArray = nums.length;

       
        for(int i = 0; i < sizeOfArray; i++) {
            
            int diff = target - nums[i];

          
            if(numToIndexMap.containsKey(diff)) {
                
                return new int[]{i, numToIndexMap.get(diff)};
            }

        
            numToIndexMap.put(nums[i], i);
        }

       
        return null;
    }
}