package javaproject;

import java.util.Scanner;


public class Computer_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1���� �迭�� ����ϴ�. �迭�� �Է� : ");
		int num = sc.nextInt();

		int[] values = new int[num];
		System.out.println("�ش� �迭 �濡 ������ �Է��ϼ���.");

		for (int i = 0; i < values.length; i++) {
			System.out.print("values[" + i + "]" + "= ");
			values[i] = sc.nextInt();
			
		}

		for (int i = 0; i < values.length; i++) {

			System.out.println("valuse[" + i + "]" + values[i]);

		}

		ComputerClass com = new ComputerClass();

		System.out.println("��µ� �ջ� ���� : " + com.sum(values));
		System.out.println("��µ� �ջ� ���� : " + com.sum(values));

		
		
		sc.close();
		
	}

}
