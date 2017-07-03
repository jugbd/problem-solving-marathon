## Let's do a problem-solving marathon!**

Every day we will post a simple Java Problem and we will solve it together.

## Instructions: 

Fork this repository: https://github.com/jugbd/problem-solving-marathon

There will be a readme file where you will find the problem description. Besides this, there will be an incomplete Java file in the source directory and test suites in the test source directory. Your job is to pass the test cases. 

You can help this marathon in multiple ways- 
1. Suggest a problem.
2. Edit this readme file
3. Enrich the test suites
4. Solve the problem and send a pull request.

End of the marathon we will announce the best contributors and there will be rewards for them. 

# Day # 1
## Find the maximum subarray sum

The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

```MaximumSubArraySum.findMaxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});```

```// should be 6: {4, -1, 2, 1}```

Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.