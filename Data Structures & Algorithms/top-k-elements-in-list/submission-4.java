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
        // PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> Integer.compare(map.get(a),map.get(b)));
        // for(int num: map.keySet()){
        //     queue.add(num);

        //     if(queue.size()>k){
        //         queue.poll();
        //     }
        // }

        // for(int i = 0;i<k;i++){
        //     answer[i] = queue.poll();
        // }

        List<Integer>[] buckets = new List[nums.length+1];

        // Place numbers into their frequency buckets
        for(int num: map.keySet()){
            int frequency = map.get(num);

            if(buckets[frequency]==null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        // collect top k frequent numbers
        int index = 0;
        for(int i = buckets.length - 1;i>=1;i--){

            if(buckets[i] != null){
                for(int num: buckets[i]){
                    answer[index++] = num;

                    if(index == k){
                        return answer;
                    }
                }
            }
        }
      return answer;
    }
}
