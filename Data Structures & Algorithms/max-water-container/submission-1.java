class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int answer = 0;
        int start = 0;
        int end = n-1;
        while(start < end){
            int width = end - start;
            int height = Math.min(heights[start],heights[end]);
            int area = width * height;
            answer = Math.max(answer,area);
            if(heights[start] <= heights[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return answer;
    }
}
