package LintCode;

public class SingleNumberIV824 {
	//跟lintcode 82题一样的思路做即可，但这道题目应该考察的是二分的知识点
    public int getSingleNumber(int[] nums) {
        // Write your code here
    	 int left = 0, right = nums.length - 1;
         while (left < right) {
             int mid = (left + right) / 2;
             if (nums[mid] == nums[mid - 1]) {
                 if ((mid - left + 1) % 2 == 1) {
                     right = mid - 2;
                 } else {
                     left = mid + 1;
                 }
             } else if (nums[mid] == nums[mid + 1]) {
                 if ((right - mid + 1) % 2 == 1) {
                     left = mid + 2;
                 } else {
                     right = mid - 1;
                 }
             } else {
                 return nums[mid];
             }
         }
         return nums[left];
    }

}
