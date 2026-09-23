class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sdict = {}
        tdict = {}
        for character in s:
            if not character in sdict:
                sdict[character] = 1
            else:
                sdict[character] +=1
        for character in t:
            if not character in tdict:
                tdict[character] = 1
            else:
                tdict[character] +=1
        return sdict == tdict