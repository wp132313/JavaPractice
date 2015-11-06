/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 	|_ Race2
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class Race2 {
	public static void main(String[] args) {   
 		System.out.println("main thread start");   
  		   
  		Thread a1 = new Thread(new Runner("박민준"));   
  		Thread a2 = new Thread(new Runner("이지호"));   
  		  
  		a2.setPriority(Thread.MAX_PRIORITY);   
  		a1.setPriority(Thread.MIN_PRIORITY);   
  		   
  		a1.start();   
  		a2.start();   
  		   
  		System.out.println("main thread end");  
	}
}
