package LintCode;

public class SingleNumber82 {
    public int singleNumber(int[] A) {
        // write your code here
    	if(A == null || A.length == 0) {
    		return 0;
    	}
    	int ans = 0;
    	for(int i = 0;i < A.length; i++) {
    		ans = ans^A[i];
    	}
		return ans;
    	
    }
    
    public static void main(String[] args) {
		 int[] A = {1,1,2,2,3,4,5,4,3};
		 SingleNumber82 my_pra = new SingleNumber82();
		 int res = my_pra.singleNumber(A);
		 System.out.println(res);
	}

}
