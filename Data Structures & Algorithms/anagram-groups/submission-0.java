class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>>map= new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1=new String(ch);
            if(map.containsKey(s1)){
                map.get(s1).add(s);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(s1,list);
            }
        }
        
        for(Map.Entry<String,List<String>>mp:map.entrySet()){
            res.add(mp.getValue());
        }
        return res;
    }
}
