package javaproject;

public class Printf_2 {

	public static void main(String[] args) {
	
		byte b = 1; //1����Ʈ
		short s = 2; //1����Ʈ
		char c = 'A'; //2����Ʈ (C������ charŸ���� 1����Ʈ��)- �����ڵ�
		int finger = 10; //4����Ʈ , ������ �⺻��(dufaultŸ��)
		long big = 10000L;// 8����Ʈ
		
		int num =255;
		int octNum = 010; //8���� 10 = (8*1) + (0*1), 10�����δ� 8�̴�.
		int hexNum = 0x16; //16���� ,10�����δ� 16�̴�.
		int binNum = 0b10; // 2����, 10�����δ� 2�̴�.
		//%d�� ����(����) �������, %n�� ����(enter), �ݵ�� ������������ ������ �׿� �����ϴ� �Ű������� ������ �����ؾ��Ѵ�.
		
		System.out.printf("b = %d \n",b);
		System.out.printf("s = %d \n",s);
		System.out.printf("c = %c , A�� �ƽ�Ű�ڵ� �� : %d \n",c, (int)c);
		//�ڸ��� ����
		System.out.printf("b = [%5d] \n",finger);
		System.out.printf("b = [%05d] \n",finger);

		//������ ���
		System.out.printf("big = %d \n",big);

		System.out.printf("octNum = %o ,%d \n",octNum,octNum); //8������ %o
		System.out.printf("hexNum = %#x ,%d \n",hexNum,hexNum); //16������ %x
		System.out.printf("binNum = %b ,%d \n",octNum,octNum); // %b�� boole
		System.out.printf("255�� 2���� �ٲ۰� = %s  \n", Integer.toBinaryString(num));
		System.out.printf("255�� 8���� �ٲ۰� = %s  \n", Integer.toOctalString(num));
		System.out.printf("255�� 2���� �ٲ۰� = %s  \n", Integer.toHexString(num));
		
		

	}

}
