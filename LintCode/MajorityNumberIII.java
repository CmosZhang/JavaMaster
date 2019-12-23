package LintCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityNumberIII
{
	public static int majorityNumber(List<Integer> nums, int k) {
		// write your code here
		if (nums == null || nums.size() == 0) {
			return 0;
		}
		int len = nums.size();
		int[] MajorNum = new int[k - 1];
		int[] count = new int[k - 1];
		boolean hasUsed = false;

		for (int i = 0; i < len; i++) {
			hasUsed = false;
			for (int j = 0; j < k - 1; j++) {
				if (MajorNum[j] == nums.get(i)) {
					count[j]++;
					hasUsed = true;
					break;
				}
			}
			if (hasUsed) {
				continue;
			}
			for (int j = 0; j < k - 1; j++) {
				if (count[j] == 0) {
					MajorNum[j] = nums.get(i);
					count[j]++;
					hasUsed = true;
					break;
				}
			}
			if (hasUsed) {
				continue;
			}

			for (int j = 0; j < k - 1; j++) {
				if (count[j] != 0) {
					count[j]--;
				}
			}
		}

		// ���ģ���ʱ�临�Ӷ�ΪO(k-1)
		for (int j = 0; j < k - 1; j++) {
			count[j] = 0;
		}

		// ��һ��ģ���ʱ�临�Ӷ�ΪO(n*(k-1))
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < k - 1; j++) {
				if (MajorNum[j] == nums.get(i)) {
					count[j]++;
				}
			}
		}

		// ���ģ���ʱ�临�Ӷ�ΪO(k-1)
		int index = 0;
		int temp = 0;
		for (int i = 0; i < k - 1; i++) {
			if (temp < count[i]) {
				temp = count[i];
				index = i;
			}
		}
		return MajorNum[index];
	}

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(3, 1, 2, 3, 2, 3, 3, 4, 4, 4));
		int k = 3;
		int res = majorityNumber(nums, k);
		System.out.println(res);
	}

}
