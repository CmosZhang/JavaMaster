package LintCode;

public class SingleNumberII83 {
	//˼·:����A
	//�� ones������ones = ones ^ A[i] & (~tows) ��˼�ǰ�A[i] ���뵽����һ�ε����������п���������Ѿ����ֹ����Σ�����Ҫ�ų��������
	//�� twos������ twos = twos ^ A[i] & (~ones) ��A[i] ���뵽�����������������γ����ˣ���Ȼ�����ˣ�
	//����ڶ��γ���,��ô�ͼ���,����ǵ�һ�γ���,������,�������ͨ����ones�ķ��ཻ������
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
    
    //��������
    //ͳ�ƶ�����ÿ��λ��1�ĸ�������3ȡģ��
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
