package javaproject;
import java.util.Scanner;
public class for_11 {

	public static void main(String[] args) {

		 
		
		
		
		/*
		 * for (int i = 2; i <= 9; i++) { System.out.println(i + "단"); for (int j = 1; j
		 * <= 9; j++) { System.out.println(i + "*" + j + "=" + i * j); }
		 * System.out.println(""); }
		 */
		
		
		int total = 0;
		String input = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			
			System.out.print("상품금액 입력 : ");
			input = sc.nextLine();
			
			if(input.equals("끝")) 
			{
				System.out.println("상품의 총 가격 " + total + "원");
				break;
			}
			total += Integer.parseInt(input);
			System.out.println("상품의 총 가격 : " + total);			
		}
		sc.close();	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
