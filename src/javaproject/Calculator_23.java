package javaproject;

public class Calculator_23 {

	public static void main(String[] args) {

		CalculatorClass cc = new CalculatorClass();
		
		cc.powerOn();
		
		System.out.println(cc.plus(10, 1));
		System.out.println(cc.divide(5, 2));
		cc.powerOff();
	}

}
