class Solution {
public:
    bool isAnagram(string s, string t) {
        //Anagrams must have the same length
        if(s.length() != t.length()) {
            return false;
        }
        // map of each charachter frequency
        map<char, int> count = createCount(s);
        // subtract, if one is negative it can't be an anagram
        for(char c : t) {
            if(!count.contains(c)) {
                return false;
            }
            count[c] -= 1;
            if(count[c] < 0) {
                return false;
            }
        }
        return true;
    }

    map<char, int> createCount(string_view s) 
    {
        map<char, int> count;
        for(char c : s) 
        {
            if(!count.contains(c))
            {
                count.insert({c, 1});
            }
            else 
            {
                count[c] = count[c] +1;
            }
        }
        return count;
    }
};
