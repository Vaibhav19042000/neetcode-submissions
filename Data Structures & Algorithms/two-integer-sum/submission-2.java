class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        int[] answer = new int[2];

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(nums[i])){
                answer[0] = map.get(nums[i]);
                answer[1] = i;
                return answer;
            }
            else{
                map.put(target - nums[i],i);
            }
        }
        return answer;
    }
}
