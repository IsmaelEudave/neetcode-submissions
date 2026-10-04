class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int price : prices){
            if (price < minValue){
                minValue = price;
            }
            if (price - minValue > maxValue){
                maxValue = price - minValue;
            }
        }
        return maxValue;
    }
}
