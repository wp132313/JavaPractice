/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ Galaxy
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class Galaxy extends SmartPhone {
	public Galaxy(){
		
	}
	public Galaxy(String model,String company,int price){
		super(model,company,price);
	}
	public void pay(){
		System.out.println("삼성 페이로 결제합니다");
	}
	public void useWirelesscharging(){
		System.out.println("무선충전 기능을 사용합니다");
	}
}
