package javaproject;
import java.util.Scanner;
public class for_11 {

	public static void main(String[] args) {

		 
		
		
		
		/*
		 * for (int i = 2; i <= 9; i++) { System.out.println(i + "��"); for (int j = 1; j
		 * <= 9; j++) { System.out.println(i + "*" + j + "=" + i * j); }
		 * System.out.println(""); }
		 */
		
		
		int total = 0;
		String input = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			
			System.out.print("��ǰ�ݾ� �Է� : ");
			input = sc.nextLine();
			
			if(input.equals("��")) 
			{
				System.out.println("��ǰ�� �� ���� " + total + "��");
				break;
			}
			total += Integer.parseInt(input);
			System.out.println("��ǰ�� �� ���� : " + total);			
		}
		sc.close();	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
