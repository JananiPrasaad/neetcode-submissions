class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int current = nums[i];
            int sub =  target-current;

            if(hmap.containsKey(sub)){
                return new int[]{hmap.get(sub), i};
            }

            hmap.put(current, i);
        }
        return new int[] {};
    }
}
