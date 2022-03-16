package javaproject;

public class TvClass {

	
	String color;
	boolean power;
	int channel;
	
	
	
	
	public void power() {
		this.power = !power;
		if(power) {
			System.out.println("tv가 켜졌습니다.");
		}else {
			System.out.println("tv가 꺼졌습니다.");
		}
	
		return;
	}
	
	
	public void chnnelUp() {
		
		if(this.channel<0) {
			System.out.println("채널에는 음수값이 없습니다. 1번채널로 돌아갑니다.");
			this.channel = 1;
		}
		
		if(this.channel>999) {
			System.out.println("더이상 채널이 없습니다. 1번채널로 돌아갑니다.");
			this.channel = 1;
		}
		this.channel++;
		return;
	}
	
	
	
	public void chnneldown() {
		
		if(this.channel<0) {
			System.out.println("채널에는 음수값이 없습니다. 1번채널로 돌아갑니다.");
			this.channel = 1;
		}
		
		if(this.channel>999) {
			System.out.println("더이상 채널이 없습니다. 1번채널로 돌아갑니다.");
			this.channel = 1;
		}
		this.channel--;
		return;
	}	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
