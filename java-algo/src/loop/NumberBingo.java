package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberBingo {
	/**
	 *  1부터 10까지 랜덤숫자를 컴퓨터가 생성하면
	 *  3회안에 숫자를 맞추는데
	 *  플레이어가 입력한 숫자가 답보다 큰지 작은지를 알려줌
	 */
	
	public static void main(String[] args) {
		int com=0, player=0, count = 0;
		com =  (int) (Math.random()*10+1);
		
		
		while(true){
			player = Integer.parseInt(JOptionPane.showInputDialog("1부터 10까지 숫자를 입력하세요"));
			try {

				
				count++ ; 
				if (player==com) {
					System.out.println("정답입니다.");
					return;
				}
				else {
					if (count==3) {
						System.out.println("게임의 총 회수는 3회입니다.");
						System.out.println("정답은 "+com);
						return;
						}
					else {
						System.out.println(player>com ? player+"보다 작습니다": player+"보다 큽니다.");
					}
				}
				
				
			}
			 catch (InputMismatchException e) {
				 System.out.println("문자는 안됩니다.");
				 count-- ; //범위밖의 숫자를 입력했을 때에는 카운트에서 제외 해준다.
			}
			
			
		}		
	}
}
