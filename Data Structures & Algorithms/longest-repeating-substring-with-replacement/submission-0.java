class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        int start = 0;
        int answer = 0;
        int maxCount = 0;
        int[] charCounts = new int[26];

        for(int end = 0;end < n;end++){
            char current = s.charAt(end);
            charCounts[current - 'A']++;
            maxCount = Math.max(maxCount,charCounts[current-'A']);
            

            while(end-start+1-maxCount > k){
                charCounts[s.charAt(start)-'A']--;
                start++;
            }
            answer = Math.max(answer,end - start + 1);
        }
        return answer;
    }
}
