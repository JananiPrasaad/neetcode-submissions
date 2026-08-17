class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> hset = new HashSet<>();

        for (int num : nums) {
            if (!hset.add(num)) {
                return true;
            }
        }

        return false;
    }

    //Using Set ensures no duplicates will be stored. So if any transaction becomes false - that means it's a duplicate
}