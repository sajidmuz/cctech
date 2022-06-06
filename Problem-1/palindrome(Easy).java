/* Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/



class Solution {
    public boolean isPalindrome(int x) {
		int temp = x;
		int revNum = 0;
		boolean flag = false;
        
		while(temp > 0) {
			revNum = revNum*10 +temp%10 ;
			temp /= 10;
		}
        
		if(x == revNum) flag = true;
		
		return flag;
    }
}

