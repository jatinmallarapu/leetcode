class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedString = new String(arr);
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedString, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}