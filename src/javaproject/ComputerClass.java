package javaproject;

public class ComputerClass {

	
	public int sum(int[] values) {
		int sum = 0;
		
//		c��� ��Ÿ��
//		for(int i = 0; i<values.length; i++) {
//			sum+=values[i];
//		}
//		
		
//		���� for��
		for(int i : values) {
			sum+=i;
		}
		
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
