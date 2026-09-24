#include <set>
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) 
    {
       //Create checked set
       //for num in nums
       //if num in checked return true 
       //else add num to set
       set<int> checked = {};
       for(int num : nums) 
       {
        if(checked.contains(num)) 
        {
            return true;
        }
        checked.insert(num);
       }
    return false;
    }
};