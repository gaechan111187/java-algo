package variable;

import java.util.Scanner;

/**
 * @file_name : Constant.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 16.
 * @story     : 상수 문법
 */
public class Constant {
	public static void main(String[] args) {
		/**
		 * 상수(constant)
		 * 상수는 데이터 그 자체를 말하며 바꿀수 없는 데이터를 말한다.
		 * 종류는 다음과 같다.
		 * 
		 * 1.정수형 상수값 : 1, 21, 100
		 * 2.실수형 상수값 : 3.14F, 3.2345d
		 * 3.문자 상수값 : 'a'
		 * 4.리터럴 상수값 : "abc"
		 */
		final int ONE_HUNDRED = 100;
		final double TAX_RATE = 0.1;
		System.out.println("연봉을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		int tax = (int) (salary*TAX_RATE);
		System.out.println("귀하가 내야할 세금은 " +tax+ " 만원입니다.");
		
		
}
}
