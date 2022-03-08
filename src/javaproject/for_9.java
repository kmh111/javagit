package javaproject;

import java.util.concurrent.CountDownLatch;


public class for_9 {

	public static void main(String[] args) {

//		
//		int i = 0;
//		int sum = 0;
//
//		while (true) {
//			if (sum < 100) {
//
//				i++;
//				sum += i;
//
//			} else {
//				System.out.println("i = " + i);
//				System.out.println("гу╟Х : " + sum);
//				break;
//			}
//		}

		for (int i = 0; i <= 10; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
			
		}		
		
		
		
		

	}

}
