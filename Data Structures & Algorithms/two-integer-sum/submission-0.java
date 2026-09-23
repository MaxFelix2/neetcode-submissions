class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!hashmap.containsKey(target-nums[i])) {
                hashmap.put(nums[i], i);
            } else {
                int[] result = {hashmap.get(target-nums[i]) , i};
                return result;
            }
        }
        int[] result = {-1, -1};
        return result;
    }
}
