class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for(int i=0;i<word1.length;i++){
            s1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            s2.append(word2[i]);
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
       return true;
    }
}