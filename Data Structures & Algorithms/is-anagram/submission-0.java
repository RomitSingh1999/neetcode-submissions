class Solution {
    public boolean isAnagram(String s, String t) {
        List<Integer> charArray= new ArrayList<>(Collections.nCopies(26, 0));
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            charArray.set(s.charAt(i)-'a',charArray.get(s.charAt(i)-'a')+1);
            charArray.set(t.charAt(i)-'a',charArray.get(t.charAt(i)-'a')-1);
        }
        for(int i:charArray){
            if(i!=0)return false;
        }
        return true;
    }
}
