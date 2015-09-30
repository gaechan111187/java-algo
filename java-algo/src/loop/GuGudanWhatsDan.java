package loop;

import java.util.Scanner;

/**
 * @file_name : GuGudanWhatsDan.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 25.
 * @story     : 단을 입력받아서 구구단 출력하기
 */
public class GuGudanWhatsDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dan = 0;
		System.out.println("몇단을 출력할까요?");
		dan = scanner.nextInt();
		for (int i = 1; i <=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}

}
