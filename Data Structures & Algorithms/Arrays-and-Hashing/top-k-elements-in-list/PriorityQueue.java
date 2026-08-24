class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int n: nums){
            hmap.put(n, hmap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> hmap.get(a) - hmap.get(b));

        for (int key: hmap.keySet()){
            heap.add(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int [] result =  new int[k];
        for (int i=0; i<k; i++){
            result[i] = heap.poll();
        }

        return result;
    }
}
