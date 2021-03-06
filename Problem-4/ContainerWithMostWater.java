/*
Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

*/



//Sol



class Solution {
    public int maxArea(int[] height) {
      	int max = 0;
	int lb = 0;   //Lower Bound
	int ub = height.length-1;    //Upper bound
		
	while(lb < ub) {

	/*
	 * We get the minimum height of lower bound and upper bound lines 
	 * for width , get difference b/w lb and ub
	 * after calculating area , compare with last calculated area to get max araa
	 * 
	 * */
		max = Math.max(max, Math.min(height[lb], height[ub])*(ub-lb));
		if(height[lb] < height[ub]) lb++;
		else --ub;
	}
		
		return max;
    
    }
}
