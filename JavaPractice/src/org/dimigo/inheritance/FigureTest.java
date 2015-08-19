/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ FigureTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class FigureTest {  
		  public static void main(String[] args) {  
	 		Circle cir = new Circle(5);  
	 		Triangle tri = new Triangle(10, 10, 5, 8);  
	 		Rectangle rec = new Rectangle(20, 20, 5, 8);
	 		System.out.println("원의 넓이 : " + String.format("%.1f", cir.calcArea()));  
	 		System.out.println("삼각형의 넓이 : " + String.format("%.1f", tri.calcArea()));  
	 		System.out.println("사각형의 넓이 : " + String.format("%.1f", rec.calcArea()));
	 		
	 		System.out.println();
	 		
	 		cir.printCenter();  
	 		System.out.println();  
	 		tri.printCenter();  
			System.out.println();  
	 		rec.printCenter();  
	 		
	 		System.out.println();  
	 		System.out.println();  
	 		System.out.println("-- 중심좌표 이동 (x, y축 5씩)");  
	 		System.out.println();  
	 		
	 		cir.moveFigure(5, 5);  
	 		System.out.println();  
	 		tri.moveFigure(5, 5);  
	 		System.out.println();  
	 		rec.moveFigure(5, 5);  
	 	}  
	 }  
