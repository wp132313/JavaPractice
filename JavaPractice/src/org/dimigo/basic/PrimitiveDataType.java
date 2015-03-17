package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean sex = true;
		int age = 23;
		double heigh = 161.8;
		float weight = 44.3f;
		char blood = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println(String.format("이름 : %s",name));
		if(sex){
			System.out.println("성별 : 여성");
		}
		System.out.println(String.format("나이 : %d 세",age));
		System.out.println(String.format("키 : %.1f cm",heigh));
		System.out.println(String.format("몸무게 : %.1f kg",weight));
		System.out.println(String.format("혈액형 : %c 형",blood));
	}
}
