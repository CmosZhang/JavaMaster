package LintCode;

public class SingleElementInASortedArray1183
{
	public int singleNonDuplicate(int[] nums) {
		// write your code here
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int len = nums.length;
		int low = 0;
		int high = len - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (mid % 2 == 1) {
				mid--;
			}
			if (nums[mid] == nums[mid + 1]) {
				low = mid + 2;
			} else {
				high = mid;
			}
		}
		return nums[low];
	}
}
