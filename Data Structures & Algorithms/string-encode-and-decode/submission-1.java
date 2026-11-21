class Solution {

    public String encode(List<String> strs) {

        StringBuilder answer = new StringBuilder();

        for(String temp: strs){
            int n = temp.length();
            answer.append(n);
            answer.append('#');
            answer.append(temp);
        }

        return answer.toString();
    }

    public List<String> decode(String str) {
            int n = str.length();

        List<String> answer = new ArrayList<>();
       
            int i = 0;
            while(i<n){
             int skip = 0;
                    while(str.charAt(i) != '#'){
                         skip = skip * 10 + str.charAt(i) - '0';
                         i++;
                    }
            String temp = str.substring(i + 1, i + 1 + skip);
              i = i+skip+1;
              answer.add(temp);
            }
            return answer;
    }
}
