class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> digits = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (digits.containsKey(complement)){
                return new int[] {digits.get(complement), i};
            }
            digits.put(nums[i], i);
        }
        return new int[]{};
    }
}
