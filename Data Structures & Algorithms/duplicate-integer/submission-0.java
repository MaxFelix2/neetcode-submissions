
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> nummap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!nummap.containsKey(nums[i])){
                nummap.put(nums[i], 1); 
            } else {
                return true;
            } 
        }
        return false;
    }
}