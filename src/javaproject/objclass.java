package javaproject;

public class objclass {

	//기본형
	byte byteField;
	short shoirtField;
	int intField =100;
	long longField;
	float floatFiled;
	double doubleFiled;
	
	//참조형
	int[] arr;
	String str;
	
	
	@Override  //어노테이션
	public String toString() {

		return this.intField+"";
	}
	
	
	
}
