package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		String car = "경차";
		int dis = 10;
		int m1=850;
		int m2=300;
		int m3=600;
		
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println(String.format("거리 : %dkm",dis));
		
		switch(car){
		case "고속버스":
			System.out.println("차종 : 고속버스");
			System.out.println(String.format("통행료 : %d원",m1+((dis-1)/10)*300));
		break;
		case "경차":
			System.out.println("차종 : 경차");
			System.out.println(String.format("통행료 : %d원",m2+((dis-1)/10)*200));
		break;
		case "그 외":
			System.out.println("차종 : 그 외");
			System.out.println(String.format("통행료 : %d원",m3+((dis-1)/10)*200));
		break;
		}
	}
}
