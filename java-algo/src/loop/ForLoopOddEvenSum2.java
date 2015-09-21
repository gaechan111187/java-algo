package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopNoddsum.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1- N의 요소의 합 구하기
 */
public class ForLoopOddEvenSum2 {
	/**
	 * 입력받은 두개의 수 범위 값 중에서 
	 * 짝수의 합과 홀수의 합을 따로 구하세요
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int initial = 0, limit = 0, oddsum = 0, evensum=0, num1=0, num2=0;
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
		if (initial % 2 == 0) {
			for (int i = initial; i <= limit; i += 2) {
				evensum += i;
			}
			for (int i = initial + 1; i <= limit; i += 2) {
				oddsum += i;
			}
		} else {
			for (int j = initial; j <= limit; j += 2) {// 2씩증가하는법은 i+=2
				oddsum += j;
			}
			for (int j = initial + 1; j <= limit; j += 2) {
				evensum += j;
			}
		}
		System.out.println(initial + "부터 " + limit + "까지의 홀수의 합은 " + oddsum + "이고, 짝수의 합은 " + evensum + "입니다.");
	}
}
