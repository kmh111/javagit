package javaproject;

public class arr2_19 {

	public static void main(String[] args) {

		
		int[][] score = new int[][] 
		{
			
			{100,100,100},
			{20,20,20},
			{40,40,40},
			{30,30,30},
			{50,50,50}
			
			
			
			
		};
		int engTotal = 0;
		int total = 0;
		double avg = 0.0;
		

		System.out.println("��ȣ\t����\t����\t����\t����\t���");
			for(int i=0; i<score.length; i++) 
			{
				int sum = 0;
				double avg2 = 0.0;
				for(int j=0; j<score[i].length; j++) {
					System.out.print("���� : " +score[i][j]);
					engTotal+=score[i][0];
				}System.out.println("");
				
			}System.out.println(engTotal);
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
