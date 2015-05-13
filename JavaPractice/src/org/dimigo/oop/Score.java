package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 13.
 * </pre>
 * 
 * @author	: 백준현
 * @version	: 1.0
 */
public class Score {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		System.out.println();
		
		
		StringBuilder sb = new StringBuilder();
		sb.append( "<<점수 출력>>\n")
			.append("국어점수 ").append(kor).append("점\n")
			.append("수학점수 ").append(math).append("점\n")
			.append("영어점수 ").append(eng).append("점\n")
			.append("총점 ").append(kor+math+eng).append("점\n")
			.append("평균 ").append(String.format("%.1f", (kor+math+eng)/3.0)).append("점\n");
		
		System.out.println(sb.toString());
		
		scanner.close();
	}
}
