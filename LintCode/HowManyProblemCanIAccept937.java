package LintCode;

public class HowManyProblemCanIAccept937 {
	//最直接的思路，这样做会超时
    public long canAccept(long n, int k) {
        // Write your code here
    	long res = 0;
    	int i = 1;
        long count = 0;
    	while(res<=n) {
    		res+=i*k;
    		i++;
    		count++;
    	}
    	return count-1;
    }
    
    //使用二分法
    public long canAccept2(long n, int k) {
        // Write your code here
    	long res = 0;
    	int i = 1;
        long count = 0;
    	while(res<=n) {
    		res+=i*k;
    		i++;
    		count++;
    	}
    	return count;
    }

}
