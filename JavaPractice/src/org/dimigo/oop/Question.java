/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String as1 = "수지";
		String as2 = "신세경";
		String as3 = "영어";
		
		System.out.println("가장 좋아하는 가수는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if("수지".equals(answer)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if("신세경".equals(answer2)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
		System.out.println("");
		
		System.out.println("가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		if("영어".equals(answer3)){
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠ");
		}
	}

}
