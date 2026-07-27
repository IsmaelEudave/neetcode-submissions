class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> buck = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];


        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for (int n : nums){
            buck.put(n, buck.getOrDefault(n,0) + 1);
        }

        for (Map.Entry<Integer,Integer> entry: buck.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; index < k && i > 0; i--){
            for (int n : buckets[i]){
                res[index++] = n;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
