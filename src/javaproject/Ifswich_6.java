package javaproject;

import java.lang.*;


public class Ifswich_6 {

	public static void main(String[] args) {

		double rand =(Math.random());
		System.out.println("���� : " + rand);
		
		int	num=	(int)(Math.random()*6+1);
		System.out.println("���� : " + num);
		
		
		if(num==1) 
		{
			System.out.println("�ֻ��� �� : 1" );
		}
		else if(num==2) 
		{
			System.out.println("�ֻ��� �� : 2");
		}
		else if(num==3) 
		{
			System.out.println("�ֻ��� �� : 3");
		}
		else if(num==4) 
		{
			System.out.println("�ֻ��� �� : 4");
		}
		else if(num==5) 
		{
			System.out.println("�ֻ��� �� : 5");
		}
		else if(num==6) 
		{
			System.out.println("�ֻ��� �� : 6");
		}
		
	
		
		switch(num)
		{
			case 1:
				System.out.println("�ֻ��� �� : 1" );
				break;
			case 2:
				System.out.println("�ֻ��� �� : 2" );
				break;
			case 3:
				System.out.println("�ֻ��� �� : 3" );
				break;
			case 4:
				System.out.println("�ֻ��� �� : 4" );
				break;
			case 5:
				System.out.println("�ֻ��� �� : 5" );
				break;
			case 6:
				System.out.println("�ֻ��� �� : 6" );
				break;
			default:
				System.out.println("���� ���");
		}
				
		
		
		
		
		
	}

}
