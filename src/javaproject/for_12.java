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
			System.out.println("���� �����Ͽ����ϴ�. ���߾����");
			while(true) 
			{
				int n = 0;
				System.out.println(low +"-"+high);
				cnt++;
				System.out.print(cnt + "�õ� >>");
				n = sc.nextInt();
				if(n<low || n>high) 
				{
				System.out.println("������ ������ϴ�.");
				break ;
				}
				else 
				{
					if(n==card) 
					{
						System.out.println("�����Դϴ�.");
						break;
					}
					else if(n>card) 
					{
						System.out.println("�� ����");
						high = n;
					}
					else
					{
						System.out.println("�� ����");
						low = n;
					}
	
					
				}
			}System.out.println("�õ�Ƚ���� "+cnt+" �Դϴ�");
			System.out.println("�ٽ� �Ͻðڽ��ϱ� (y/n)");
			
			if(sc.next().equals("n"))
			{
				break;
			}
		
			}sc.close();
		}		
		
		

}
