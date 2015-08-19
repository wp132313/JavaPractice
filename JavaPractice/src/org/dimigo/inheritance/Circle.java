/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ Circle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class Circle extends Figure {  
		private int radius;  
	 	public Circle(int radius) {  
	 		this.radius = radius;  
		}  
	 	public Circle(int centerX, int centerY, int r) {  
			super(centerX, centerY);  
	 	}  
	 	protected double calcArea() {  
			return 3.14*radius*radius;	  
		}  
	 	protected void printCenter(){  
			System.out.print("원 ");  
	 		super.printCenter();  
	 	}  
	  }  
