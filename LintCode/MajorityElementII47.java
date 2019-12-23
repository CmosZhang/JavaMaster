package LintCode;

import java.util.List;

public class MajorityElementII47 {
	   public int majorityNumber(List<Integer> nums) {
	        // write your code here
		   if(nums == null || nums.size() == 0) {
			   return 0;
		   }
		   int len = nums.size();
		   int candidate1 = 0,candidate2 = 0;
		   int count1 = 0, count2 = 0;
		   for(int i = 0; i < len; i++) {
			   if(candidate1 == nums.get(i)) {
				   count1++;
			   }
			   else if(candidate2 == nums.get(i)) {
				   count2++;
			   }
			   else if(count1 == 0) {
				   candidate1 = nums.get(i);
				   count1 = 1;
			   }
			   else if(count2 == 0) {
				   candidate2 = nums.get(i);
				   count2 = 1;
			   }
			   else {
				   count1--;
				   count2--;
			   }
		   }
		   count1 = count2 = 0;
		   for(int i = 0; i<len;i++) {
			   if(nums.get(i) == candidate1) {
				   count1++;
			   }
			   else if(nums.get(i) == candidate2) {
				   count2++;
			   }
		   }
		   return count1>count2?candidate1:candidate2;
	    }

}
