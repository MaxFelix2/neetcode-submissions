class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramDict = dict()
        for string in strs:
            sortedString = "".join(sorted(string))
            if sortedString in anagramDict.keys():
                anagramDict[sortedString].append(string)
            else:
                anagramDict[sortedString] = [string]
        return [x for x in anagramDict.values()]
        