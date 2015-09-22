package array;

import java.util.Scanner;

/**
 * @file_name : Money.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money4 {
	/**
	 * 예를 들어서 134,530원 이면
	 * 거스름돈을 화폐로 표시해주면 5만원: 2, 1만원: 3, 1천원: 4 ... 
	 * 표시하고 10원 미만은 절삭
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int mok = 0;
		int nmg = 0;
		for (int i = 0; i < moneyUnit.length; i++) {
			mok = money /moneyUnit[i];
			nmg = money%moneyUnit[i];
			money = nmg;
			System.out.println(moneyUnit[i]+"원 : "+mok+"개");
		}
	}
}
