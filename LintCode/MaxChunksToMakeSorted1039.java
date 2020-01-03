package LintCode;

public class MaxChunksToMakeSorted1039
{
	// 1039. 最大分块排序
	public int maxChunksToSorted(int[] arr) {
		// write your code here
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int len = arr.length;
		int[] MaxOfLeft = new int[len];
		int[] MinOfRight = new int[len];
		MaxOfLeft[0] = arr[0];
		for (int i = 1; i < len; i++) {
			MaxOfLeft[i] = Math.max(MaxOfLeft[i - 1], arr[i]);
		}
		MinOfRight[len - 1] = arr[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			MinOfRight[i] = Math.min(MinOfRight[i + 1], arr[i]);
		}
		int res = 0;
		for (int i = 0; i < len - 1; i++) {
			if (MaxOfLeft[i] <= MinOfRight[i + 1])
				res++;
		}
		return res + 1;
	}
	
	//1040. 最大分块排序 II
	public int maxChunksToSorted2(int[] arr) {
		// Write your code here
		if (arr == null || arr.length == 0) {
			return 0;
		}
		
	}

}
