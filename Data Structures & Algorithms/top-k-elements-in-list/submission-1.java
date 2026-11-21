class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> map = new HashMap<>();

     for(int i = 0;i<nums.length;i++){

        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
     }

   List<Map.Entry<Integer,Integer>> temp = new ArrayList<>(map.entrySet());
     
     temp.sort((a,b)-> b.getValue()- a.getValue());

      int[] answer = new int[k]; 
      

      for(int i = 0;i<k;i++){
        answer[i] = temp.get(i).getKey();
      }
      return answer;
    }
}
