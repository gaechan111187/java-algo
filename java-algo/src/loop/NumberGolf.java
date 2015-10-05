package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @file_name : NumberGolf.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 10. 5.
 * @story     : 최단횟수로 숫자 맞추기 게임
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count= 0, com=0, player=0;
		com = (int) (Math.random()*100+1);
		System.out.println("컴퓨터의 숫자는 정해졌습니다.");
		while(true){
			System.out.println("1부터 100사이의 정수를 입력하세요");
			try {
				player = scanner.nextInt();
				if (player<1 || player>100) {
					System.out.println("1부터 100까지의 정수만 입력해야합니다.");
					continue;
				} else {
					if (com==player) {
						System.out.println("정답입니다.");
						return;
					}
					else {
						System.out.println(player<com ? player+"보다 큽니다." : player+"보다 작습니다.");
					}

				}
				
			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다.");return;
			}
			count++;
			System.out.println(count+"회전 중입니다.");
		}
	}
}
