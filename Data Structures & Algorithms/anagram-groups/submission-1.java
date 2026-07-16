class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> check = new HashMap<>();
        for (String s : strs){
            int[] counts = new int[26];
            for (char c : s.toCharArray()){
                counts[c-'a']++;
            }
        String key = Arrays.toString(counts);
        check.putIfAbsent(key, new ArrayList<>());
        check.get(key).add(s);
        }
        return new ArrayList<>(check.values());
    }
}