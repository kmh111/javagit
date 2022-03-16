package javaproject;

import java.util.Scanner;


public class Computer_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1차원 배열을 만듭니다. 배열수 입력 : ");
		int num = sc.nextInt();

		int[] values = new int[num];
		System.out.println("해당 배열 방에 정수를 입력하세요.");

		for (int i = 0; i < values.length; i++) {
			System.out.print("values[" + i + "]" + "= ");
			values[i] = sc.nextInt();
			
		}

		for (int i = 0; i < values.length; i++) {

			System.out.println("valuse[" + i + "]" + values[i]);

		}

		ComputerClass com = new ComputerClass();

		System.out.println("출력된 합산 값은 : " + com.sum(values));
		System.out.println("출력된 합산 값은 : " + com.sum(values));

		
		
		sc.close();
		
	}

}
