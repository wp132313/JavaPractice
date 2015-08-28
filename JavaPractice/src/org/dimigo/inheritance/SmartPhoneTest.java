/**
 * 
 */
package org.dimigo.inheritance;

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
		SmartPhone[] p = {
				new iPhone("아이폰 6","애플",700000),
				new Galaxy("갤럭시 s6","삼성",650000)
		};
		for(SmartPhone smartphone : p) {  
			 System.out.println(smartphone.toString());  
			 smartphone.turnOn();  
			 smartphone.pay();  
			 smartphone.useSpecialFunction();  
			 smartphone.turnOff();
			 System.out.println("");
			}	  
		}  
	}

