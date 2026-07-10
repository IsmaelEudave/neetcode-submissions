class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> findDupe = new HashSet<>();
        for (int num : nums){
            if (findDupe.contains(num)){
                return true;
            }
            findDupe.add(num);
        }
     return false;
    }
}