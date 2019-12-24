package LintCode;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastPositionofElementInSortedArray1536
{
	
    public List<Integer> searchRange(List<Integer> nums, int target) {
        // Write your code here.
    	if(nums ==null||nums.size()==0) {
    		return nums;
    	}
    	int last = lastPosition(nums, target);
    	int first = firstPosition(nums, target);
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	res.add(first);
    	res.add(last);
		return res;
    	
    }
    //last position
	public static int lastPosition(List<Integer> nums, int target) {
		int len = nums.size();
		int left = 0;
		int right = len - 1;
		while (left < right - 1) {
			int mid = (right - left) / 2 + left;
			if (nums.get(mid) <= target) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (nums.get(right) == target) {
			return right;
		}
		if (nums.get(left) == target) {
			return left;
		}
		return -1;
	}
	
	//first position
	public static int firstPosition(List<Integer>nums, int target) {
		int len = nums.size();
		int left = 0;
		int right = len - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (nums.get(mid) >= target) {
				right = mid;
			}
			else{
				left = mid;
			}
		}
		if (nums.get(left) == target) {
			return left;
		}
		if (nums.get(right) == target) {
			return right;
		}
		return -1;
	}

}
