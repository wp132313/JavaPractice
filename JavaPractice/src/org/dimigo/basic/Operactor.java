package org.dimigo.basic;

public class Operactor {

	public static void main(String[] args) {
		int a = 9;
		int b =10;
		double h = 5.8;
		
		int a1 = 9;
		double h1 = 5.4;
		
		double s1 = (a+b)*h/2;
		double s2 = a1*h1;
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println(String.format("사다리꼴 넓이:%.1f",s1));
		System.out.println(String.format("평행사변형의 넓이:%.1f",s2));
		System.out.println("");
		System.out.println("");
		System.out.println(String.format("사다리꼴이 평행사변형 보다 %.1f 더 큽니다.",s1-s2));
	}
}
