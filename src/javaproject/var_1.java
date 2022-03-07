package javaproject;

import java.util.Scanner;

public class var_1 {

	public static void main(String[] args) {
			
		
		int a = 0;
		String b = null;
		
		System.out.print("숫자를 입력하세요 : ");

		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt(); //인트정수입력 받음
		
		 System.out.println("입력한 값은 : " + a);
		 
		 sc.nextLine();
		 
		 System.out.print("문자열 입력하세요 : ");
		 
		 b = sc.nextLine();
		 
		 System.out.println("입력한 값은 : " + b);
		 
		 
		
		
		
		sc.close();
		
		

	}

}
