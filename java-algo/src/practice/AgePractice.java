package practice;

import java.util.Scanner;

/**
 * @file_name : OldPrac.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 18.
 * @story     : 생년월일 입력시 나이 구하기
 */
public class AgePractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("생년월일을 입력하시오(ex)840101");
		int old = scanner.nextInt();
		if (old>999999 || old<000101) {
			System.out.println("다시 입력하세요");return;
		}
		System.out.println("올해 년도를 입력하시오(ex)2014");
		int year = scanner.nextInt();
		if (year>9999 || year<0) {
			System.out.println("다시 입력하세요");return;
		}
		int year1 = year-1900;
		int age = year1-(old/10000)+1;
		System.out.println("당신의 나이는"+age+"입니다.");
		
	}

}
