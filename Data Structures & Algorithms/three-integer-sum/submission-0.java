class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // traversing from 1 to n-1

        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0;i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0) {
    break;
}
            int target = nums[i];
            int left = i+1;
            int right = n-1;

            while( left<right){
                int sum = nums[left] + nums[right];
                if(sum == -target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[left]);
                    temp.add(target);
                    temp.add(nums[right]);
                    answer.add(temp);
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if(sum > -target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }

        return answer;
    }
}
