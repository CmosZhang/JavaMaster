package LintCode;

public class MaximumSwap1095 {
    public int maximumSwap(int num) {
        // Write your code here
    	if(num < 10) {
    		return num;
    	}
    	char[] digits = String.valueOf(num).toCharArray();
        int[] buckets = new int[10];//ʹ�� buckets ����¼���� 0 ~ 9 ��������λ�á�
        
  
        for(int i = 0; i < digits.length; i++)
            buckets[digits[i] - '0'] = i;

        for(int i = 0; i < digits.length; i++){       //�����λ��ʼ
            for(int j = 9; j > digits[i] - '0'; j--){   //��Ҫ������digits[i]��
                if(buckets[j] > i){                 //���j���ֵ�λ����i�ĺ���
                   swap(digits, i, buckets[j]);                   
                   return Integer.valueOf(new String(digits));
                }
            }
        }
        
        return num;
    }
    
    private void swap(char[] digits, int i, int j){
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

}
