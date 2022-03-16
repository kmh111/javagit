package javaproject;

public class obj_21 {

	public static void main(String[] args) {

		
		objclass fvalue = new objclass();
		String str = new String("자바");
		
		System.out.println("기본형변수");
		System.out.println("byteFiled : "+fvalue.byteField);
		System.out.println("shortFiled : "+fvalue.shoirtField);
		System.out.println("intFiled : "+fvalue.intField);
		System.out.println("longFiled : "+fvalue.longField);
		System.out.println("doubleFiled : "+fvalue.doubleFiled);
		System.out.println("floatFiled : "+fvalue.floatFiled);
		
		
		
		
			//참조형
		System.out.println("arrFiled : "+fvalue.arr);
		System.out.println("StringFiled : "+fvalue.str);
		
		System.out.println(fvalue.toString());
		System.out.println(str.toString());
		
		
		
	
		
	}

}
