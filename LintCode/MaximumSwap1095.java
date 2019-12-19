package LintCode;

public class MaximumSwap1095 {
    public int maximumSwap(int num) {
        // Write your code here
    	if(num < 10) {
    		return num;
    	}
    	char[] digits = String.valueOf(num).toCharArray();
        int[] buckets = new int[10];//使用 buckets 来记录数字 0 ~ 9 的最后出现位置。
        
  
        for(int i = 0; i < digits.length; i++)
            buckets[digits[i] - '0'] = i;

        for(int i = 0; i < digits.length; i++){       //从最高位开始
            for(int j = 9; j > digits[i] - '0'; j--){   //需要比数字digits[i]大
                if(buckets[j] > i){                 //如果j出现的位置在i的后面
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
