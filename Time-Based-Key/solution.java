class Data{
    int timestamp;
    String value;

    Data(int time, String val){
        timestamp=time;
        value=val;
    }
}

class TimeMap {
    Map<String, List<Data>> map;
    public TimeMap() {
        map = new HashMap<String, List<Data>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key, new ArrayList<>());
        map.get(key).add(new Data(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        List<Data> arr = map.get(key);
        int l=0;
        int r = arr.size()-1;

        while(l<r){
            int m = (l+r) >> 1;
            if(arr.get(m).timestamp<timestamp){
                if(arr.get(m+1).timestamp>timestamp || arr.get(m).timestamp==timestamp)
                    return arr.get(m).value;
                l=m+1;
            }
            else
                r=m-1;
        }
        
        return arr.get(l).timestamp <= timestamp ? arr.get(l).value : "";
    }
}

