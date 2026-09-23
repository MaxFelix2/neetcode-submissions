
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> nummap = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!nummap.contains(nums[i])){
                nummap.add(nums[i]); 
            } else {
                return true;
            } 
        }
        return false;
    }
}