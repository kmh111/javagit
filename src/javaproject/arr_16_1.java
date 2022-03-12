package javaproject;

import java.util.Arrays;

public class arr_16_1 {

	public static void main(String[] args) {

		
		char[] abc = new char[] {'A','B','C','D'};
		char[] num = new char[] {'0','1','2','3','4','5','6','7'};
		
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length+num.length];
		
		System.out.println(result.length);
		System.out.println(result.toString());
		System.out.println(Arrays.toString(result));
		
		System.out.println("------------------------------------");
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.out.println(Arrays.toString(result));
		System.arraycopy(num, 0, result, 4, num.length);
		System.out.println(Arrays.toString(result));
		
		System.out.println("------------------------------------");
		
		char[] tarArr = new char[12];
		tarArr = Arrays.copyOf(abc, num.length);
		System.out.println(Arrays.toString(tarArr));
		
		
		
		
		
	}

}
