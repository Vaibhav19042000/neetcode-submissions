class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if(m > n) return false;

        int start = 0;
        int last = m;

        
            int[] s1count = new int[26];
            int[] tempcount = new int[26];
             String temp = s2.substring(start,last);
            // lec 
           
            for(int i = 0;i < temp.length();i++){
                    char current = temp.charAt(i);
                    char compare = s1.charAt(i);
                    tempcount[current-'a']++;
                    s1count[compare-'a']++;
            }
        while(last <= n){
           

            boolean flag = true;
            // checking the length is same or not for those array if same return true or false
            for(int i = 0;i<26;i++){
                if(s1count[i] != tempcount[i]){
                   
                    flag = false;
                    break;
            }
        }
                    if(flag) return true;
                    tempcount[s2.charAt(start)-'a']--;
                    if (last < n) {
        tempcount[s2.charAt(last) - 'a']++;
    }
                    start++;
                    last++;
        }
        return false;
    }
}
