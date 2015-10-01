package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int a1 =  1700000;
		int n1 = 3;
		int g1 = 1500;
		long s1 =  (long) a1*(long) n1*(long) g1 *12;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println(String.format("월 평균 급여 : %,d원",a1));
		System.out.println(String.format("점포 내 직원 수 : %,d명",n1));
		System.out.println(String.format("점포 수 : %,d개",g1));
		System.out.println("");
		System.out.println("");
		System.out.println(String.format("연간 인건비 : %,d원",s1));
	}
}
