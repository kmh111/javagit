package javaproject;

import java.util.Scanner;


public class for_12 {

	public static void main(String[] args) {

		
		
		int low = 0;
		int high = 0;
		int card = 0;
	
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			
			int cnt = 0;
			low = 0;
			high = 100;
			card = (int)(Math.random()*100+1);
			System.out.println(card);
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			while(true) 
			{
				int n = 0;
				System.out.println(low +"-"+high);
				cnt++;
				System.out.print(cnt + "시도 >>");
				n = sc.nextInt();
				if(n<low || n>high) 
				{
				System.out.println("범위를 벗어났습니다.");
				break ;
				}
				else 
				{
					if(n==card) 
					{
						System.out.println("정답입니다.");
						break;
					}
					else if(n>card) 
					{
						System.out.println("더 낮게");
						high = n;
					}
					else
					{
						System.out.println("더 높게");
						low = n;
					}
	
					
				}
			}System.out.println("시도횟수는 "+cnt+" 입니다");
			System.out.println("다시 하시겠습니까 (y/n)");
			
			if(sc.next().equals("n"))
			{
				break;
			}
		
			}sc.close();
		}		
		
		

}
