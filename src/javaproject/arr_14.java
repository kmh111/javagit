package javaproject;

import java.util.Scanner;import com.sun.jdi.Value;

public class arr_14 {

	public static void main(String[] args) {

		/*
		 * int[] score = new int[10];
		 * 
		 * for (int i=0; i<score.length; i++) { System.out.println("score"+i+"="+
		 * score[i]);
		 * 
		 * }
		 * 
		 */
		
		
		/*
		 * int sum =0; double avg = 0.0;
		 * 
		 * 
		 * int[] score = new int[] {100,88,100,100,90};
		 * System.out.println("�迭�� ���� : "+score.length);
		 * System.out.println("�迭�� ���� : "+score.length*4);
		 * 
		 * 
		 * for(int i=0; i<score.length; i++) {
		 * 
		 * sum+=score[i];
		 * 
		 * System.out.println("sum : "+ sum); }
		 * 
		 * 
		 * 
		 * avg = (double)(sum) / score.length;
		 * 
		 * System.out.println("���� : " + sum); System.out.println("���� : "+avg);
		 */
		
		int room = 0;
		int sum = 0;
		double avg = 0;
		
		
		System.out.print("��� ���� ����ðڽ��ϱ� : ");
		Scanner sc = new Scanner(System.in);
		room = sc.nextInt();
		
		int[] value = new int[room];
		
		System.out.println("���� �Է��ϼ���!!");

		for (int i = 0; i < value.length; i++) {
			value[i] = sc.nextInt();
			System.out.println("���� : "+value[i]);
			sum +=value[i];
			avg = (int) ((double)sum /  value.length);
		}

		System.out.println("=================================");
		
		if (room == value.length) {
			System.out.println("���� : "+sum);
			System.out.println("��� : "+avg);
			System.out.println("stop");
		}sc.close();
	}
}
