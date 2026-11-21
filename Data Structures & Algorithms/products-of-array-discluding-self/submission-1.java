class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] answer = new int[nums.length];
        int value = 1;
        for(int i = 0;i<nums.length;i++){
                value = value * nums[i];  
        }

        for(int i = 0;i<nums.length ;i++){
            if(nums[i] != 0){
                answer[i] = value/nums[i];
            }
            else{
                int temp = 1;
                for(int j= 0;j<nums.length;j++){
                    if(i!=j){
                        temp = temp * nums[j]; 
                    }
                }
                answer[i] = temp;
            }
        }

        return answer;
    }
}  
