package javaproject;

import java.util.Scanner;

public class Scanner_4 {

	public static void main(String[] args) {

		int num1, num2, result = 0; // ����ڷ����(Scanner���).nextInt()
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");

		num1 = sc.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		num2 = sc.nextInt();

		result = num1 + num2;
		
		System.out.println("��°��");
		System.out.println("num1 �Է� : "+ num1);
		System.out.println("num2 �Է� : "+ num2);
		System.out.println("result �Է� : " + result);
		
		
		
		sc.close();
		
		
		
		
		/*��°��
		 * num1 �Է� : 10 num2 �Է� : 50 result : 60 
		 */

	}

}
