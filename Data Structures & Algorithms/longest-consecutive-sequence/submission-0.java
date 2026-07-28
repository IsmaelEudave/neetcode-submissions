class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (int n : nums){
            numsSet.add(n);
        }

        int longest = 0;
        for (int n : nums){
            if (!numsSet.contains(n-1)){
                int length = 0;
                while (numsSet.contains(n+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
    }
}
