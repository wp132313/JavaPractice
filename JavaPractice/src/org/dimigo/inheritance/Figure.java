/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ Figure
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class Figure {  
	 	private int centerX;  
	 	private int centerY;  
	 	public Figure() {  
	 		  }  
	 	public Figure(int centerX, int centerY) {  
	 		this.centerX = centerX;  
	 		this.centerY = centerY;  
	 	}  
	 	protected double calcArea() {  
	 		return 0.0;	  
	 	}  
	 	protected void printCenter() {  
	 		System.out.printf("중심 좌표 : (%d, %d)" , centerX, centerY);  
	 	}  
	 	protected void moveFigure(int x, int y) {  
	 		System.out.printf("중심 좌표 : (%d, %d)" , centerX + x, centerY + y);  
	 	}  
} 

