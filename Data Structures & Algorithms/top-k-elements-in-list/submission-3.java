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

//    List<Map.Entry<Integer,Integer>> temp = new ArrayList<>(map.entrySet());
     
//      temp.sort((a,b)->Integer.compare( b.getValue(), a.getValue()));

  
      

    //   for(int i = 0;i<k;i++){
    //     answer[i] = temp.get(i).getKey();
    //   }

        int[] answer = new int[k]; 
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> Integer.compare(map.get(a),map.get(b)));
        for(int num: map.keySet()){
            queue.add(num);

            if(queue.size()>k){
                queue.poll();
            }
        }

        for(int i = 0;i<k;i++){
            answer[i] = queue.poll();
        }
      return answer;
    }
}
