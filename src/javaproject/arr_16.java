package javaproject;

import java.util.Arrays;

public class arr_16 {

	public static void main(String[] args) {

		/*
		 * int[] arr = new int[5];
		 * 
		 * 
		 * for(int i=0; i<arr.length; i++) { arr[i]=i+0; }
		 * System.out.println("º¯°æÀü - arr.length : "+ arr.length);
		 * System.out.println(Arrays.toString(arr));
		 * 
		 * 
		 */
		/*
		 * 
		 * 
		 * 
		 * int[] numarr = new int [10]; int sum=0; for(int i=0; i<numarr.length; i++) {
		 * numarr[i]=i; System.out.println(numarr[i]); }
		 * 
		 * System.out.println(Arrays.toString(numarr));
		 * 
		 * 
		 * 
		 */
		
		
		
		char[] abc = new char[] {'a','b','c','d'};
		
		char[] num = new char[]{'0','1','2','3','4','5','6','7'};
		System.out.println(abc);
		System.out.println(Arrays.toString(num));
		
		
		
		
		char[] result = new char[abc.length+num.length];
		System.out.println("result : "+ result.length);
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println("result : "+ Arrays.toString(result));

		
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println("result : "+ Arrays.toString(result));
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
