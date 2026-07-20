class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        String sortedS = new String (charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        String sortedT = new String (charT);

        if(sortedS.hashCode() == sortedT.hashCode()){
            return true;
        }
        return false;
    }
}
