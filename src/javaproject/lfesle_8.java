package javaproject;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class lfesle_8 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		
		double weight,height,bmi = 0.0;
	
	
		System.out.print("Ű(cm) �Է� : ");
		height = sc.nextDouble();
		
		System.out.print("������(kg) �Է� : ");
		weight = sc.nextDouble();
		
		bmi = weight / (height*height);
		//System.out.println(height +" " +  weight);
	
		if(bmi>=20&&bmi<25) 
		{
			System.out.println("ǥ�� �Դϴ�." + bmi);
			
		}
		else 
		{
			System.out.println("�� �Դϴ�." + bmi);
		}
	

	
	
	
	
	}

}
