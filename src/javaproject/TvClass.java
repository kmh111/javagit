package javaproject;

public class TvClass {

	
	String color;
	boolean power;
	int channel;
	
	
	
	
	public void power() {
		this.power = !power;
		if(power) {
			System.out.println("tv�� �������ϴ�.");
		}else {
			System.out.println("tv�� �������ϴ�.");
		}
	
		return;
	}
	
	
	public void chnnelUp() {
		
		if(this.channel<0) {
			System.out.println("ä�ο��� �������� �����ϴ�. 1��ä�η� ���ư��ϴ�.");
			this.channel = 1;
		}
		
		if(this.channel>999) {
			System.out.println("���̻� ä���� �����ϴ�. 1��ä�η� ���ư��ϴ�.");
			this.channel = 1;
		}
		this.channel++;
		return;
	}
	
	
	
	public void chnneldown() {
		
		if(this.channel<0) {
			System.out.println("ä�ο��� �������� �����ϴ�. 1��ä�η� ���ư��ϴ�.");
			this.channel = 1;
		}
		
		if(this.channel>999) {
			System.out.println("���̻� ä���� �����ϴ�. 1��ä�η� ���ư��ϴ�.");
			this.channel = 1;
		}
		this.channel--;
		return;
	}	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
