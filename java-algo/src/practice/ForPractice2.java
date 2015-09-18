package practice;

import java.util.Scanner;

/**
 * @file_name : ForPractice2.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 18.
 * @story     : 구구단연습
 */
public class ForPractice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 출력 프로그램");
		System.out.println("출력할 단을 입력하세요");
		int dan = scanner.nextInt();
		System.out.println(dan+"단");
		System.out.println("==============");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}

}
