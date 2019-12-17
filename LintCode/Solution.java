package LintCode;


public class Solution {
	 public static void main(String []args) {
		    RelativeRanks my_pra = new RelativeRanks();
	    	int[] nums = {5,4,3,2,1};
	    	String [] res = my_pra.findRelativeRanks(nums);
	    	for(int i=0;i<res.length;i++) {
	    		System.out.print(res[i]+"    ");
	    	}
	    }
}
