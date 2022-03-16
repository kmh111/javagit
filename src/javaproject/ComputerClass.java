package javaproject;

public class ComputerClass {

	
	public int sum(int[] values) {
		int sum = 0;
		
//		c언어 스타일
//		for(int i = 0; i<values.length; i++) {
//			sum+=values[i];
//		}
//		
		
//		향상된 for문
		for(int i : values) {
			sum+=i;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
