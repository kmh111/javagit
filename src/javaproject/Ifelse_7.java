package javaproject;

import java.util.Scanner;

public class Ifelse_7 {

	public static void main(String[] args) {

		//조건이 딱 절반의 경우(50%)일때 사용
		
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("성별을 입력하세요. : "); String gender = sc.next();
		  
		  if (gender.equals("남자")) { System.out.println("남자 입니다."); } else {
		  System.out.println("여자 입니다."); }
		  
		  sc.close();
		 
	
		
		
		int time = (int)(Math.random()*4)+8;  //8~11
		
		//System.out.println(time);
		
		
		switch(time) 
		{
		
			case  8 :
				System.out.println(time + "출근합니다.");
				break;
			case  9 :
				System.out.println(time + "회의합니다.");
				break;
				
			case  10 :
				System.out.println(time +"업무합니다.");
				break;
				
			case 11 :
				System.out.println(time +"외근합니다.");
				break;
		
		}
		
	}

}
