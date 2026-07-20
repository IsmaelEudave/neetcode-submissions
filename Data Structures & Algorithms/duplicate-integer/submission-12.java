class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupe = new HashSet<>();
        for (int n : nums){
            if (dupe.contains(n)){
                return true;
            }
            dupe.add(n);
        }
        return false;
    }
}