package javaproject;

import java.util.Scanner;

public class for_10 {

	public static void main(String[] args) {

		
		
//		int sum = 0;
//		int total = 0;
//
//		for (int i = 0; i < 5; i++) {
//			total += i;
//			System.out.println("i : " + i + "_" + "total : " + total);
//		}
//
//		System.out.println(total); 

		/*
		 * int sum = 0; int i = 0;
		 * 
		 * for (i = 1; i <= 100; i++) { sum += i;
		 * 
		 * if (sum >= 2200) { break; } }System.out.println("1~" + (i - 1) + " 합 :" +
		 * sum);
		 * 
		 */
		
		/*
		 * int i = 0;
		 * 
		 * while(true) { if(i>11) { break; } i++; }System.out.println(i);
		 */
		
		
		/*
		 * int i = 0; int sum = 0;
		 * 
		 * while(i<=100) { sum+=i; i++; System.out.println("i : "+i+"_"+sum);
		 * }System.out.println("i : "+i+"_"+sum);
		 */		
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in); String input = null;
		 * 
		 * System.out.println("메시지를 입력하세요"); System.out.println("프로그램 종료 Q");
		 * 
		 * do{ System.out.println(">>"); input = sc.nextLine();
		 * System.out.println(input);
		 * 
		 * }while(!input.equals('Q')); System.out.println("프로그램 종료 합니다."); sc.close();
		 * 
		 */
		
		
		
		int keycode = 0;
		int speed = 0;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		
		
		while(run) {	
			System.out.println("------------------------------");
			System.out.println("1.증속 | 2.감속 | 3. 중지");
			keycode = sc.nextInt();
			
			if(keycode==1) {
				speed++;
				System.out.println("현재속도 : "+ speed);
			}else if(keycode==2) {
				speed--;
				System.out.println("현재속도 : "+ speed);
			}else if(keycode==3) {
				run = false;
				
			}
		}System.out.println("프로그램 종료");
		 sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}
}
