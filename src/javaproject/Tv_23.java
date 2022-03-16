package javaproject;

public class Tv_23 {

	public static void main(String[] args) {
		
		
		TvClass tv = new TvClass();
		TvClass tv2 = new TvClass();
		tv2 = tv;
		

		
		tv.channel = 7;
		tv.power();
		tv.chnnelUp();
		
		
		
		
		
		
		
		System.out.println(tv.power);
		System.out.println(tv.toString());
		System.out.println("-------------------------------------");
		
		tv2.channel = 7;
		tv2.power();
		tv2.chnnelUp();
		
		System.out.println(tv2.channel);
		System.out.println(tv2.power);
		System.out.println(tv2.toString());
		
		tv2.channel =15;
		
		
		System.out.println(tv2.channel);
		
		
		
		
		
		
		

	}

}
