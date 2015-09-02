/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone iPhone = new iPhone("iPhone6","애플",700000);  
		SmartPhone Galaxy = new Galaxy("갤럭시 S6","삼성",650000);  

		System.out.println(iPhone);  
		iPhone.turnOn();  
		iPhone.pay();  
		iPhone.useSpecialFunction();  
		iPhone.turnOff();  
		 		  
		System.out.println();  
		 		  
		System.out.println(Galaxy);  
		Galaxy.turnOn();  
		Galaxy.pay();  
		Galaxy.useSpecialFunction();  
		Galaxy.turnOff();  
	}
}

