package javaproject;

import java.util.Arrays;


public class arr2_18 {

	public static void main(String[] args) {

		
		int[][] score = new int[][] 
		{
										{101,102,103},
										{11,12,13},
										{21,22,23},
										{31,32,33}
										
		};
		
		int sum = 0;
		
		score[0][2] = 80;
//		System.out.println(Arrays.toString(score));
//		System.out.println(score.toString());
//		System.out.println(score);
		
		for(int i=0; i<score.length; i++)
		{
			for (int j=0; j<score[i].length; j++) 
			{
				System.out.print(score[i][j]+"\t");
			}System.out.println("");
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=0; i<score.length; i++)	{
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
