class Solution {
    public int[] twoSum(int[] nums, int target) {
          int left = 0;
            int right = nums.length-1;


        while(left<right){
            int sum = nums[left] + nums[right];

            if(sum>target){
                right--;
            }else if(sum<target){
                left ++;
            }else {
                // Return 1-based indices as required by the problem
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[]{};
    }
}
