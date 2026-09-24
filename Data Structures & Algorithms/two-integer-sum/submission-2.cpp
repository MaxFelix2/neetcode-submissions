class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // for int i 
        // z = target - num
        // for y in nums     
        // if y = z
        for(int i{0}; i < nums.size(); ++i) 
        {
            int x { target - nums[i]};
            for(int j{i+1}; j < nums.size(); ++j)
            {
                if(x == nums[j]) 
                {
                    vector<int> res = {i,j};
                    return res;
                }
            }            
        }
        // not reachable by task definition
        vector<int> res = {-1, -1};
        return res;
    }
};
