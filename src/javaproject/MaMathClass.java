package javaproject;

public class MaMathClass {

	
	public long add(long a, long b) {
		return a+b;
		
		
	}
	
	public long substract(long a, long b) {
		return a-b;
		
		
	}
	
	
	
	
	public static long multiply(long a, long b) {
		//인스턴스 변수 가능 
		//int x = 0;
		
		
		//static int y= 0 ;
		return a*b;
	}
	
	
	public static long divide(long a, long b) {
		return a/b;
	}
	
	
	public String studyJava() {
		//지역변수는 static 절대로 붙이면 안된다.
		//static int a = 0;
		
		return "java 수업을 합니다.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
