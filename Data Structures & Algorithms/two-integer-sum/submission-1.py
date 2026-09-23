class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numDict = dict()
        j = 0
        for num in nums:   
            x = target-num
            if x in numDict.keys():
                return [numDict[x], j]
            else:
                numDict[num] = j
            j += 1 
        return -1