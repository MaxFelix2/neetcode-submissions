class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        length = len(stones)
        maxHeap = [-num for num in stones]
        heapq.heapify(maxHeap)
        while(length > 1):
            x = -heapq.heappop(maxHeap)
            y = -heapq.heappop(maxHeap)
            if(x < y):
                y = y-x
                heapq.heappush(maxHeap, -y)
                length -= 1
            elif (x > y):
                x = x-y
                heapq.heappush(maxHeap, -x)
                length -=1
            else:
                length -=2

        if(length == 0):
                return 0
        return -maxHeap[0]
            