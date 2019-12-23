package LintCode;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII84 {
	 public static List<Integer> singleNumberIII(int[] A) {
	        // write your code here
		 if(A == null || A.length == 0) {
			 return new ArrayList<Integer>();
		 }
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 int num1 = 0;
		 int num2 = 0;
		 int XOR = 0;
		 for(int i = 0; i < A.length;i++) {
			 XOR ^= A[i];
		 }
		 int index = FindFirstBits1(XOR);
		 for(int i = 0;i < A.length; i++) {
			 if(((A[i]>>index)&1) == 1) {
				 num1 ^= A[i];
			 }
			 else {
				 num2 ^= A[i];
			 }
		 }
		 res.add(num1);
	     res.add(num2);
		 return res; 
	 }
	 
	 
	 static int FindFirstBits1(int num) {
		 int indexBit = 0;
		 while((num&1)==0&&(indexBit < 32)) {
			 num = num >> 1;
		     ++indexBit;
		 }
		 return indexBit;
	 }
	 
     public static void main(String[] args) {
    	 int[] A = {1,1,2,3,4,4};
    	 ArrayList<Integer> res = (ArrayList<Integer>) singleNumberIII(A);
    	 int len = res.size();
    	 for(int i = 0; i < len; i++) {
    		 System.out.print(res.get(i)+" ");
    	 }
     }

}
