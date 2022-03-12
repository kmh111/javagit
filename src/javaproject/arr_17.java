package javaproject;

import java.util.Arrays;


public class arr_17 {


	public static void main(String[] args) {

		int[] ball = new int[5];
		
		
		
		for(int i=0; i<ball.length; i++) {
				
			ball[i] =(int)(Math.random()*45+1);
		}
		System.out.println("Á¤·ÄÀü : "+Arrays.toString(ball));
		
		
		for (int i = 0; i < ball.length; i++) {
			for (int j = 0; j < ball.length - 1; j++) {
				
				if (ball[j] > ball[j + 1]) {
					int temp = ball[j];
					temp = ball[j];
					ball[j] = ball[j + 1];
					ball[j + 1] = temp;
					if (ball[j] == ball[j + 1]) {
					}
				}
				
			}
		}
		System.out.println(Arrays.toString(ball));		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
