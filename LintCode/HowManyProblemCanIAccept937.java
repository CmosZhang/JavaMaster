package LintCode;

public class HowManyProblemCanIAccept937 {
	//��ֱ�ӵ�˼·���������ᳬʱ
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
    
    //ʹ�ö��ַ�
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
