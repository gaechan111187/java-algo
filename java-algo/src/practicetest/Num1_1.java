package practicetest;

import java.util.Scanner;

/**
 * @file_name : Num1_1.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 06년2학기 과제 1번
 */
public class Num1_1 {
/**
 * 더하기 계산기
 * 숫자 2개를 입력받고 합산된 값을 출력한다.
 * 결과물 예시)
 * 값1 >> 10
 * 값2 >> 5
 * 결과 >> 15
 */
	public static void main(String[] args) {
		int input1=0, input2=0, result=0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("값1>>");
		input1 = scanner.nextInt();
		System.out.println("값2>>");
		input2 = scanner.nextInt();
		result = input1 + input2;
		System.out.println("결과 >> "+result);
	}
}
