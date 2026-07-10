class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> targetFinder = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            targetFinder.put(nums[i], i);
        }

        for (int i = 0; i< nums.length; i++){
            int diff = target - nums[i];
            if ((targetFinder.containsKey(diff)) && (targetFinder.get(diff) != i))
                return new int[]{i, targetFinder.get(diff)};
        }
        return new int[]{};
    }
}
