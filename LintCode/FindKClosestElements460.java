package LintCode;

public class FindKClosestElements460
{
	public int[] kClosestNumbers(int[] A, int target, int k) {
		// write your code here
		if (A == null || A.length == 0 || A.length <= k) {
			return A;
		}
		int[] ans = new int[k];
		int index = FindTargetIndex(A, target);
		int left = index - 1;
		int right = index;
		for (int i = 0; i < k; i++) {
			if (left < 0) {
				ans[i] = A[right];
				right++;
			} else if (A.length <= right) {
				ans[i] = A[left];
				left--;

			} else {
				if (target - A[left] <= A[right] - target) {
					ans[i] = A[left];
					left--;
				} else {
					ans[i] = A[right];
					right++;
				}
			}
		}
		return ans;
	}

	public static int FindTargetIndex(int[] A, int target) {
		int low = 0;
		int high = A.length - 1;
		while (low + 1 < high) {
			int mid = low + (high - low) / 2;
			if (A[mid] < target) {
				low = mid;
			} else if (A[mid] > target) {
				high = mid;
			} else {
				return mid;
			}
		}
		return high;
	}
}
