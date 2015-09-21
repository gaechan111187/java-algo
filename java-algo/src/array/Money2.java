package array;

import java.util.Scanner;

/**
 * @file_name : Money.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money2 {
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
		int[] count = new int[8];
		for (int i = 0; i < moneyUnit.length; i++) {
			if (i==0) {
				count[i] = money / moneyUnit[i];
			}
			else {
			count[i] = (money % moneyUnit[i-1])/moneyUnit[i];
			}
		}
		System.out.println("5만:"+count[0]+",1만:"+count[1]+",5천:"+count[2]+", 1천:"+count[3]+ ", 500원:"+ count[4]+", 100원:"+ count[5]+", 50원:"+count[6]+", 10원:"+count[7]);
	}
}
