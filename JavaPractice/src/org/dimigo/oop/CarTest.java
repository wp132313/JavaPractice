/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class CarTest {
	public static void main(String[] args){
		Car Car1 = new Car();
		Car Car2 = new Car();
		Car Car3 = new Car();
		
		Car1.setCompany("현대자동차");
		Car1.setModel("제네시스");
		Car1.setColor("검정색");
		Car1.setMaxSpeed(225);
		Car1.setPrice(50000000);
		
		Car2.setCompany("기아자동차");
		Car2.setModel("K7");
		Car2.setColor("흰색");
		Car2.setMaxSpeed(246);
		Car2.setPrice(40000000);
		
		Car3.setCompany("삼성자동차");
		Car3.setModel("SM7");
		Car3.setColor("회색");
		Car3.setMaxSpeed(200);
		Car3.setPrice(38000000);
		
		System.out.println("<<자동차 목록>>");
		System.out.println("");
		System.out.println("제조사명 : "+ Car1.getCompany());
		System.out.println("모델명 : "+ Car1.getModel());
		System.out.println("색상 : "+ Car1.getColor());
		System.out.println("최대속도 : "+ Car1.getMaxSpeed()+"km");
		System.out.println("가격 : "+ String.format("%,d",Car1.getPrice())+"원");
		System.out.println("");
		System.out.println("제조사명 : "+ Car2.getCompany());
		System.out.println("모델명 : "+ Car2.getModel());
		System.out.println("색상 : "+ Car2.getColor());
		System.out.println("최대속도 : "+ Car2.getMaxSpeed()+"km");
		System.out.println("가격 : "+ String.format("%,d",Car2.getPrice())+"원");
		System.out.println("");
		System.out.println("제조사명 : "+ Car3.getCompany());
		System.out.println("모델명 : "+ Car3.getModel());
		System.out.println("색상 : "+ Car3.getColor());
		System.out.println("최대속도 : "+ Car3.getMaxSpeed()+"km");
		System.out.println("가격 : "+ String.format("%,d",Car3.getPrice())+"원");
	}
}
