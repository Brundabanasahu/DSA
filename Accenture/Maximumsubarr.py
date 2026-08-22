def maxSubArray(nums):
        maxsum=nums[0]
        currsum=0

        for num in nums:
            currsum+=num
            maxsum=max(maxsum,currsum)

            if currsum<0:
                currsum=0
                
            
        return maxsum  


nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

print(maxSubArray(nums))