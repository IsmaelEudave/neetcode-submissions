class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sorted = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            sorted.putIfAbsent(key, new ArrayList<>());
            sorted.get(key).add(s);
        }
        return new ArrayList<>(sorted.values());
    }
}
