package javaproject;

public class obj_22 {

	public static void main(String[] args) {

		//static은  인스턴스 생성 없이도 접근 가능
		System.err.println("Card.width = "+ cardClass.whidth);
		System.err.println("Card.height = "+ cardClass.height);
		
		cardClass card1 = new cardClass();
		
		card1.kind = "하트";
		card1.number = 7;
		
		System.out.println("card1으 상세");
		System.out.println("무늬 : "+card1.kind);
		System.out.println("숫자 : "+card1.number);
		
		//static 변수는  인스턴스변수명이 아닌 클래스명으로 접근해야 올바르다.
		System.out.println("너비 : "+cardClass.whidth);
		System.out.println("높이 : "+cardClass.height);
		
		
		
		
		MaMathClass mmc = new MaMathClass();
		
		System.out.println("add(5L, 3L) =  "+mmc.add(5, 3));
		System.out.println("substract(5L, 3L) =  "+mmc.substract(5, 3));
		System.out.println("multiply(5L, 3L) =  "+MaMathClass.multiply(5L, 3L));
		System.out.println("divide(5L, 3L) =  "+MaMathClass.divide(5L, 3L));
		System.out.println(mmc.studyJava());
		
		
		
		
	}

}
