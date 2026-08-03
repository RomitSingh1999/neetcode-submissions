public class TimeMap {
    Map<String, List<Map.Entry<String,Integer>>> timebox = new HashMap<>();
    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        timebox.computeIfAbsent(key, k -> new ArrayList<>())
                .add(new AbstractMap.SimpleEntry<>(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if(!timebox.containsKey(key))return "";
        List<Map.Entry<String,Integer>> resultset=timebox.get(key);

        if(resultset.isEmpty())return "";
        int i=0,j=resultset.size()-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(resultset.get(mid).getValue()==timestamp)return resultset.get(mid).getKey();
            if(resultset.get(mid).getValue()<timestamp){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        if (j >= 0)
            return resultset.get(j).getKey();
        return "";
    }

}
