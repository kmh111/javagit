package javaproject;

public class obj_22 {

	public static void main(String[] args) {

		//static��  �ν��Ͻ� ���� ���̵� ���� ����
		System.err.println("Card.width = "+ cardClass.whidth);
		System.err.println("Card.height = "+ cardClass.height);
		
		cardClass card1 = new cardClass();
		
		card1.kind = "��Ʈ";
		card1.number = 7;
		
		System.out.println("card1�� ��");
		System.out.println("���� : "+card1.kind);
		System.out.println("���� : "+card1.number);
		
		//static ������  �ν��Ͻ��������� �ƴ� Ŭ���������� �����ؾ� �ùٸ���.
		System.out.println("�ʺ� : "+cardClass.whidth);
		System.out.println("���� : "+cardClass.height);
		
		
		
		
		MaMathClass mmc = new MaMathClass();
		
		System.out.println("add(5L, 3L) =  "+mmc.add(5, 3));
		System.out.println("substract(5L, 3L) =  "+mmc.substract(5, 3));
		System.out.println("multiply(5L, 3L) =  "+MaMathClass.multiply(5L, 3L));
		System.out.println("divide(5L, 3L) =  "+MaMathClass.divide(5L, 3L));
		System.out.println(mmc.studyJava());
		
		
		
		
	}

}
