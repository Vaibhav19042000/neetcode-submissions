class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n==0) return 0;

        HashSet<Integer> seen = new HashSet<>();

        // adding all numbers to hashset to remove duplicates
        for(int i = 0;i<n;i++){
            seen.add(nums[i]);
        }

        // now will check for consecutive numbers
        int answer = 0;
        int starting = 0;
        for(int i = 0;i<n;i++){
           if(!seen.contains(nums[i]-1)){
            starting = nums[i];
            int current = nums[i];
                int count = 1;
                 // Count consecutive numbers
                while (seen.contains(current + 1)) {
                    current++;
                    count++;
                }

                answer = Math.max(answer, count);
           }


        }
      
      return answer;
    }
}
