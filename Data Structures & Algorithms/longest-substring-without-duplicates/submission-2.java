class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
          if(n == 1) return 1;
        HashMap<Character,Integer> hs = new HashMap<>();
        int answer = 0;
        int left = 0;
        int right = 0;
        while ( right < n){
                if((hs.containsKey(s.charAt(right))) && ( hs.get(s.charAt(right)) >= left )){
                    int position = hs.get(s.charAt(right));
                    left = position+1;
                }
                
                    hs.put(s.charAt(right),right);
                    int temp = right - left + 1;
                    answer = Math.max(temp,answer);
                    right++;
                
        }
        return answer;
    }
}
