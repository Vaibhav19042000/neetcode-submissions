class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int n = nums.length;
        while(i<n-1 && j <n){
            if(nums[i]==nums[j]){
                return true;
            }
            else{
                i++;
                j++;
            }
        }
        return false;
    }
}