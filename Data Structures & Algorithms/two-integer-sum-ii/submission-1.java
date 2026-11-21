class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];

        int start = 0;
        int last = numbers.length-1;

        while(start<last){
            int sum = numbers[start]+numbers[last];
            if(sum == target){
                answer[0] = start+1;
                answer[1] = last+1;
                return answer;
            }
            else if(sum > target){
                last--;
            }
            else{
                start++;
            }
        }
        return answer;

    }
}
