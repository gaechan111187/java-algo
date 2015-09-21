package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopNSum.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1- N의 요소의 합 구하기
 */
public class ForLoopNSum {
	/**
	 * To. 개발자님 
	 * 교수님이 원하는 수부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 * 그런데, 교수님이 까다로와서 큰 수를 먼저 입력하든
	 * 나중에 입력하든 두 수 사이의 정수들의 합을 나오게 해달랍니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int initial = 0, limit = 0, sum = 0, num1=0, num2=0;
		System.out.println("첫번째 숫자를 입력하시오");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		num2 = scanner.nextInt();
		if (num1>num2) {
			initial = num2;
			limit = num1;
		}
		else  {
			initial = num1;
			limit = num2;
		}
		for (int i = initial; i <=limit; i++) {
			sum += i;
		}
		System.out.println(initial+"부터 "+limit+"까지의 합은 "+sum+"입니다.");
	}
}