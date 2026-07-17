class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] charsS = s.toCharArray();
        Arrays.sort(charsS);

        char[] charsT = t.toCharArray();
        Arrays.sort(charsT);

        return Arrays.equals(charsS,charsT);
        }
    }
