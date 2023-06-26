
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String st: strs){
            char c[]= st.toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);
            if(!map.containsKey(s))
                map.put(s, new ArrayList<String>() );
            map.get(s).add(st);
        }

        return new ArrayList<>(map.values());
    }
}
