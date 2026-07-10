class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsInWordOne = s.toCharArray();
        Arrays.sort(charsInWordOne);
        String sortedWordone = new String(charsInWordOne);

        char[] charsInWordTwo = t.toCharArray();
        Arrays.sort(charsInWordTwo);
        String sortedWordtwo = new String(charsInWordTwo);

        if (sortedWordone.hashCode() == sortedWordtwo.hashCode()){
            return true;
        }
        return false;
    }
}
