package javaproject;

import java.util.Scanner;

public class Scanner_4 {

	public static void main(String[] args) {

		int num1, num2, result = 0; // 사용자루부터(Scanner사용).nextInt()
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫번째 숫자를 입력하세요 : ");

		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = sc.nextInt();

		result = num1 + num2;
		
		System.out.println("출력결과");
		System.out.println("num1 입력 : "+ num1);
		System.out.println("num2 입력 : "+ num2);
		System.out.println("result 입력 : " + result);
		
		
		
		sc.close();
		
		
		
		
		/*출력결과
		 * num1 입력 : 10 num2 입력 : 50 result : 60 
		 */

	}

}
