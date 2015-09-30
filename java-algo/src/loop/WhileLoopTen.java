package loop;

import java.util.Scanner;

/**
 * @file_name : WhileLoopTen.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 24.
 * @story     : 
 */
public class WhileLoopTen {
	public static void main(String[] args) {
		int i = 1, sum=0, key=0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("원하는 업무를 선택하세요\n "
	 				+ "1:통장개설, 2.스톱");
			key = scanner.nextInt();
			System.out.println(i+"\t");
			switch (key) {
			case 1: i++;
				break;
			case 2:
				return;
			default:
				break;
			}
		}
	}
}
