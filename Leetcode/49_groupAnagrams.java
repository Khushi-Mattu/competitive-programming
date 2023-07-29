class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String str: strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(!map.containsKey(temp)){
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(str);
        }
        return new ArrayList<>(map.values());
        
        

    }
}