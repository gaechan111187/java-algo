package practicetest;

import java.util.Scanner;

/**
 * @file_name : Num1_2_1.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 06년2학기 과제 2번
 */
public class Num1_2_1 {
	/**
	 * 삼각형의 높이를 입력받고 삼각형을 출력하라. 방향은 무관.
	 * 결과물 예시)
	 * *
	 * **
	 * ***
	 */
	public static void main(String[] args) {
		int height = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("삼각형 높이를 입력하세요");
		height = scanner.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println("");
		}
		
	}
}
