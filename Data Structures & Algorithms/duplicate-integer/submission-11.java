class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> dupe = new HashSet<>();
        for (int i : nums){
            if(dupe.contains(i)){
                return true;
            }
        dupe.add(i); 
        }
        return false;
    }
}