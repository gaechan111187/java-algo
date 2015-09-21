package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopNSum.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1- N의 요소의 합 구하기
 */
public class ForLoopSum {
	/**
	 * To. 개발자님 
	 * 교수님이 1부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0 ;
		System.out.println("1부터 n까지의 합구하는 프로그램입니다.");
		System.out.println("n값을 입력하세요.");
		int limit = scanner.nextInt();
		for (int i = 1; i <=limit ; i++) {
			sum = sum+i;//String s= "";
		}
		System.out.println("1부터 n까지의 합은 "+sum+"입니다.");
	}

}
