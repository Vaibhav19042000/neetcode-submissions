class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if( m > n) return "";
        int[] count = new int[60];
        int[] tcount = new int[60];
        int start = 0;
        int last = 0;
        String answer = "";

        int min = Integer.MAX_VALUE;
        
         for(int i = 0;i<m;i++){
            char current = t.charAt(i);
            tcount[current - 'A']++;
        }

        
        while( last<n ){
            count[s.charAt(last)-'A']++;
            last++;
         
             while(isValid(count,tcount)){
                if(last - start < min){
                    min = last-start;
                    answer = s.substring(start,last);
                }
                count[s.charAt(start)-'A']--;
                start++;
             }
            
        }
return answer;
    }

    private boolean isValid(int[] count,int[] tcount){
        for(int i = 0;i<60;i++){
            if(tcount[i] > count[i]){
                return false;
            }
        }
         return true;
    }
} 
