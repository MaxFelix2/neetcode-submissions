class Solution {
public:
    bool isAnagram(string s, string t) {
        // Create map for string s and t with frequency
        map<char, int> sMap = createCount(s);
        map<char, int> tMap = createCount(t);
        return sMap == tMap;
        
    }

    map<char, int> createCount(string_view s) 
    {
        map<char, int> count;
        for(char c : s) 
        {
            if(!count.contains(c))
            {
                count.insert({c, count[c] + 1});
            }
            else 
            {
                count[c] = count[c] +1;
            }
        }
        return count;
    }
};
