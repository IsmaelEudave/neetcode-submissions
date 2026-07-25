class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] res = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        int postfixval = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            postfix[i] = postfixval;
            res[i] = postfix[i] * prefix[i];
            postfixval *= nums[i];
        }
        return res;
    }
}  
