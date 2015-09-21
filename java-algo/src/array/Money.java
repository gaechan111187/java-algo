package array;

import java.util.Scanner;

/**
 * @file_name : Money.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money {
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
		moneyUnit[0] = money/50000 ;
		moneyUnit[1] = (money%50000)/10000; 
		moneyUnit[2] = (money%10000)/5000;
		moneyUnit[3] = (money%10000)%5000 / 1000;
		moneyUnit[4] = (money%1000)/500;
		moneyUnit[5] = (money%1000)%500 /100;
		moneyUnit[6] = (money%100)/50;
		moneyUnit[7] = (money%100)%50 /10;
		System.out.println("5만:"+moneyUnit[0]+",1만:"+moneyUnit[1]+",5천:"+moneyUnit[2]+", 1천:"+moneyUnit[3]+ ", 500원:"+ moneyUnit[4]+", 100원:"+ moneyUnit[5]+", 50원:"+moneyUnit[6]+", 10원:"+moneyUnit[7]);
	}
}
