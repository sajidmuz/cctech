/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/



//Sol




class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
	int len2 = nums2.length;
	int[] newArr = new int[len1+len2];
	double res = 0;
	int i = 0,j = 0,k=0;
		
		
	/*Merge array in sorted order
	 * and store in newArr
	 * */
	while(i<len1 && j<len2) {

		if(nums1[i] < nums2[j]) {
			newArr[k++] = nums1[i++];
		}else {
			newArr[k++] = nums2[j++];
		}
	}
	while(i<len1) {
		newArr[k++] = nums1[i++];
	}
	while(j<len2) {
		newArr[k++] = nums2[j++];
	}

	k--;

	//Find the median 
	if(k%2 == 1) {
		res = (newArr[k/2] + newArr[(k/2)+1])/2.0;
	}else {
		res = newArr[(k/2)];
	}

	return res;
    }
}
