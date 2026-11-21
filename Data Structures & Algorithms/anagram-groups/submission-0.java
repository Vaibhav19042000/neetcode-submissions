class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){

            String convertedString = getCharCountString(strs[i]);

            if(map.containsKey(convertedString)){
                map.get(convertedString).add(strs[i]);
            }
            else{
                List<String> perGroup = new ArrayList<>();
                perGroup.add(strs[i]);
                map.put(convertedString,perGroup);
            } 
        }
         List<List<String>> answer = new ArrayList<>();
            for(List<String> test :map.values()){
                    answer.add(test);
            }

            return answer;
    }

    private String getCharCountString(String data){

        int[] frequency = new int[26];

        for(char c : data.toCharArray()){
                frequency[c - 'a']++;
        }

        char test = 'a';
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<frequency.length;i++){
            temp.append(test);
            temp.append(frequency[i]);
            test++;
        }

        return temp.toString();
    }
}