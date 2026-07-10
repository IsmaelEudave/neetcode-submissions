class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedWord = new String(chars);

        char[] charstwo = t.toCharArray();
        Arrays.sort(charstwo);
        String sortedWordtwo = new String(charstwo);
        
        if (sortedWord.hashCode() == sortedWordtwo.hashCode()){
            return true;
        }
        return false;
    }
}
