class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayS);
        Arrays.sort(arrayT);
        String sortedS = new String (arrayS);
        String sortedT = new String (arrayT);
        for (int i = 0; i < s.length(); i++){
            if (sortedS.charAt(i) != sortedT.charAt(i) || sortedS.length() != sortedT.length()){
                return false;
            }
        }
    return true;
    }
}
