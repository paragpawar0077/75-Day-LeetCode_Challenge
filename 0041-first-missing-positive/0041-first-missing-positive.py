class Solution:
    def firstMissingPositive(self, nums):
        i = 0
        n = len(nums)

        # Cyclic sort
        while i < n:
            correct = nums[i] - 1

            if 1 <= nums[i] <= n and nums[i] != nums[correct]:
                nums[i], nums[correct] = nums[correct], nums[i]
            else:
                i += 1

        # Find missing number
        for i in range(n):
            if nums[i] != i + 1:
                return i + 1

        return n + 1