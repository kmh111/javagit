package javaproject;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class lfesle_8 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		
		double weight,height,bmi = 0.0;
	
	
		System.out.print("키(cm) 입력 : ");
		height = sc.nextDouble();
		
		System.out.print("몸무게(kg) 입력 : ");
		weight = sc.nextDouble();
		
		bmi = weight / (height*height);
		//System.out.println(height +" " +  weight);
	
		if(bmi>=20&&bmi<25) 
		{
			System.out.println("표준 입니다." + bmi);
			
		}
		else 
		{
			System.out.println("비만 입니다." + bmi);
		}
	
	
	
	
	
	
	}

}
