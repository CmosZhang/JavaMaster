package LintCode;

import java.util.Arrays;

public class SortTransformedArray906 {
	//时间复杂度为O(nlogn),
	//排序的时候采用的快排算法
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        // Write your code here
    	if(nums == null||nums.length == 0) {
    		return nums;
    	}
    	int len = nums.length;
    	int[] res = new int[len];
    	for(int i = 0; i < len; i++) {
    		res[i] = a * nums[i]*nums[i] + b *nums[i] + c;
    	}
    	Arrays.sort(res);
    	return res;
    }
    //不使用快排
    public int[] sortTransformedArray2(int[] nums, int a, int b, int c) {
        // Write your code here
    	if(nums == null||nums.length == 0) {
    		return nums;
    	}
    	int len = nums.length;
    	int[] res = new int[len];
    	for(int i = 0; i < len; i++) {
    		int  temp = a * nums[i]*nums[i] + b *nums[i] + c;
    		if(i == 0) {
    			res[i] = temp;
    		}
    		else {
    			int j = i - 1;
    			while(j>=0&&res[j]>temp) {
    				res[j+1] = res[j];
    				j--;
    			}
    			res[j+1] = temp;
    		}
    	}
    	return res;
    }

}
