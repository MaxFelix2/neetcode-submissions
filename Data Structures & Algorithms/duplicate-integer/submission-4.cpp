class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        //Numbers we have already seen
        unordered_set<int> num_set;
        for(int n: nums) {
            //If it already exists return true
            if(num_set.contains(n)) {
                return true;
            } else {
            //Else we add to set
                num_set.insert(n);
            }
        }
        //No duplicate was found
        return false;
        
    }
};