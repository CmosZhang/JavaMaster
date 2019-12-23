package LintCode;

public class SingleNumberII83 {
	//思路:遍历A
	//对 ones操作，ones = ones ^ A[i] & (~tows) 意思是把A[i] 计入到出现一次的情况里，但是有可能这个数已经出现过两次，所以要排除两次情况
	//对 twos操作， twos = twos ^ A[i] & (~ones) 把A[i] 计入到两次情况，如果第三次出现了，自然消掉了，
	//如果第二次出现,那么就计入,如果是第一次出现,不计入,这个过程通过和ones的非相交来控制
    public int singleNumberII(int[] A) {
        // write your code here
    	if(A == null || A.length == 0) {
    		return 0;
    	}
    	int ones = 0;
    	int twos = 0;
    	for (int i = 0; i < A.length; i++) {
    		ones = (ones ^ A[i])&(~twos);
    		twos = (twos ^ A[i])&(~ones);
    	}
    	return ones;
    }
    
    //方法二：
    //统计二进制每个位上1的个数并对3取模。
    public int singleNumberII2(int[] A) {
        // write your code here
    	if(A == null || A.length == 0) {
    		return 0;
    	}
    	int res = 0;
    	int[] bits = new int[32];
    	for(int i = 0; i < 32; i++) {
    		for(int j = 0;j < A.length; j++) {
    			bits[i] += A[j]>>i&1;
    		    bits[i] %=3;
    		}
    		res |=(bits[i]<<i);
    	}
    	return res;
    }

}
