package javaproject;

import java.util.Scanner;

public class var_1 {

	public static void main(String[] args) {
			
		
		int a = 0;
		String b = null;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");

		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt(); //��Ʈ�����Է� ����
		
		 System.out.println("�Է��� ���� : " + a);
		 
		 sc.nextLine();
		 
		 System.out.print("���ڿ� �Է��ϼ��� : ");
		 
		 b = sc.nextLine();
		 
		 System.out.println("�Է��� ���� : " + b);
		 
		 
		
		
		
		sc.close();
		
		

	}

}
