package javaproject;

import java.lang.*;


public class Ifswich_6 {

	public static void main(String[] args) {

		double rand =(Math.random());
		System.out.println("痢荐 : " + rand);
		
		int	num=	(int)(Math.random()*6+1);
		System.out.println("痢荐 : " + num);
		
		
		if(num==1) 
		{
			System.out.println("林荤困 传 : 1" );
		}
		else if(num==2) 
		{
			System.out.println("林荤困 传 : 2");
		}
		else if(num==3) 
		{
			System.out.println("林荤困 传 : 3");
		}
		else if(num==4) 
		{
			System.out.println("林荤困 传 : 4");
		}
		else if(num==5) 
		{
			System.out.println("林荤困 传 : 5");
		}
		else if(num==6) 
		{
			System.out.println("林荤困 传 : 6");
		}
		
	
		
		switch(num)
		{
			case 1:
				System.out.println("林荤困 传 : 1" );
				break;
			case 2:
				System.out.println("林荤困 传 : 2" );
				break;
			case 3:
				System.out.println("林荤困 传 : 3" );
				break;
			case 4:
				System.out.println("林荤困 传 : 4" );
				break;
			case 5:
				System.out.println("林荤困 传 : 5" );
				break;
			case 6:
				System.out.println("林荤困 传 : 6" );
				break;
			default:
				System.out.println("裹困 哈绢巢");
		}
				
		
		
		
		
		
	}

}
