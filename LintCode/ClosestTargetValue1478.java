package LintCode;

import java.util.Arrays;

public class ClosestTargetValue1478
{
	public int closestTargetValue(int target, int[] array) {
		// Write your code here
		if (array == null || array.length == 0) {
			return -1;
		}
		Arrays.sort(array);
		int dif = Integer.MAX_VALUE;
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			if (array[left] + array[right] > target) {
				right--;
			} else {
				dif = Math.min(dif, target - (array[left] + array[right]));
				left++;
			}
		}
		if (dif == Integer.MAX_VALUE) {
			return -1;
		} else {
			return target - dif;
		}
	}

}
