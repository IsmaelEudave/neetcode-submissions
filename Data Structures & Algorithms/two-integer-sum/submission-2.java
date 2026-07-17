class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> finder = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if (finder.containsKey(diff)){
                return new int[]{finder.get(diff),i};
            }
            finder.put(num, i);
        }
        return new int[]{};
    }
}
