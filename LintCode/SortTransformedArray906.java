package LintCode;

import java.util.Arrays;

public class SortTransformedArray906 {
	//ʱ�临�Ӷ�ΪO(nlogn),
	//�����ʱ����õĿ����㷨
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
    //��ʹ�ÿ���
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
