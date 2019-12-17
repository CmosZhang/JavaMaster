package LintCode;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
	 public static String[] findRelativeRanks(int[] nums) {
	        // write your code here
	        HashMap<Integer,Integer> score = new HashMap();
	        for (int i = 0; i < nums.length; i++)
	            score.put(nums[i], i);
	    	Arrays.sort(nums);
			for (int i = 0; i < nums.length/2; i++) {
			    int temp = nums[i];
			    nums[i] = nums[nums.length-i-1];
			    nums[nums.length-i-1] = temp;
			}
	        String[] answer = new String[nums.length];
	        for (int i = 0; i < nums.length; i++)
	        {
	            String res = String.valueOf(i + 1);
	            if (i == 0)
	                res = "Gold Medal";
	            if (i == 1)
	                res = "Silver Medal";
	            if (i == 2)
	                res = "Bronze Medal";
	            answer[score.get(nums[i])] = res;
	        }
	        return answer;
	 }

}
