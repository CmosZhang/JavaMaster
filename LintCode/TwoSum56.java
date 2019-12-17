package LintCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class TwoSum56 {
	//方法1，采用的hash的思路，用到额外的数组空间
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
    	if(numbers==null||numbers.length==0) {
    		return numbers;
    	}
    	HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    	int[] res=new int[2];
    	for(int i=0;i<numbers.length;i++) {
    		if(hashMap.containsKey(numbers[i])) {
    			res[0]=hashMap.get(numbers[i]);
    			res[1]=i;
    			return res;
    		}
    		hashMap.put(target-numbers[i], i);
    	}
        return res;
    }
    
    class Pair {
        Integer value;
        Integer index;
        
        Pair(Integer value, Integer index) {
           this.value = value;
           this.index = index;
        }
        Integer getValue() {
            return this.value;
        }
    }

    class ValueComparator implements Comparator<Pair> {    
   
       @Override    
       public int compare(Pair o1, Pair o2) {    
           return o1.getValue().compareTo(o2.getValue());      
       }
    }
    //方法二，使用双指针法
   public int[] twoSum2(int[] numbers, int target) {
       // write your code here
       //用一个pair数组记录每个numbers[i]的值和它的位置i，防止排序后不知道该元素的位置
       Pair[] number = new Pair[numbers.length];
       for(int i=0;i<numbers.length;i++) {
           number[i] = new Pair(numbers[i], i);
       }
       //排序后使用双指针
       Arrays.sort(number, new ValueComparator());
       int L=0, R =  numbers.length-1;
       while(L<R) {
           if( number[L].getValue() + number[R].getValue() == target) {
               int t1 = number[L].index;
               int t2 = number[R].index;
               int[] result = {Math.min(t1,t2), Math.max(t1,t2)};
               return result;
           }
           if( number[L].getValue() + number[R].getValue() < target) {
               L++;
           } else {
               R--;
           }
       }
       int[] res = {};
       return res;
   }
 }