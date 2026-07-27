class Solution {
    private Map<Character,Integer> map=new HashMap<>();
    public boolean isValid(int i,int j,int k){
        int mm=maxfreq();
        // System.out.println("Valid check: "+i+" "+j+" "+mm+" "+k+"\n");
        return (j-i+1)-mm<=k;
    }
    private int maxfreq(){
        int max_val=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            max_val=Math.max(max_val,entry.getValue());
            // System.out.println("maxfreq check: "+entry.getKey()+", "+entry.getValue()+", "+max_val);
        }
        return max_val;
    }
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int max_len=0;
        if(s.length()==0)
        return max_len;
        
        while(j<s.length()){
            // System.out.println(s.charAt(j)+" "+map.getOrDefault(s.charAt(j),0));
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(isValid(i,j,k)){
                // System.out.println(i+" "+j+"\n");
                max_len=Math.max(max_len,j-i+1);
                j++;
                
            }
            else{
                while(!isValid(i,j,k)){
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                    i++;
                }
                j++;
                
            }
        }
        return max_len;
    }
}
