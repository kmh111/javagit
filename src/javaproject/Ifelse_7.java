package javaproject;

import java.util.Scanner;

public class Ifelse_7 {

	public static void main(String[] args) {

		//������ �� ������ ���(50%)�϶� ���
		
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("������ �Է��ϼ���. : "); String gender = sc.next();
		  
		  if (gender.equals("����")) { System.out.println("���� �Դϴ�."); } else {
		  System.out.println("���� �Դϴ�."); }
		  
		  sc.close();
		 
	
		
		
		int time = (int)(Math.random()*4)+8;  //8~11
		
		//System.out.println(time);
		
		
		switch(time) 
		{
		
			case  8 :
				System.out.println(time + "����մϴ�.");
				break;
			case  9 :
				System.out.println(time + "ȸ���մϴ�.");
				break;
				
			case  10 :
				System.out.println(time +"�����մϴ�.");
				break;
				
			case 11 :
				System.out.println(time +"�ܱ��մϴ�.");
				break;
		
		}
		
	}

}
