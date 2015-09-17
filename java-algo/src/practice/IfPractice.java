package practice;

import java.util.Scanner;

/**
 * @file_name : IfPractice.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 17.
 * @story     : 비교문 연습
 */
public class IfPractice {
	public static void main(String[] args) {
		System.out.println("당신이 루저인지 아닌지 판단합니다.");
		System.out.println("당신의 성별을 입력하시오");
		System.out.println("1.남 2.여");
		Scanner scanner = new Scanner(System.in);
		int se = scanner.nextInt();
		
		if(se==2) {
			System.out.println("당신은 판단하지 않습니다.");}
		else if(se>2){
			System.out.println("1번2번 중에 골라라");}
		
		else {
					
		System.out.println("당신의 키를 입력하시오.");
		int num = scanner.nextInt();
		
		String win = "루저";

		if(num>=180){
			 win= "위너";		}
		System.out.println("당신은 "+win + "입니다.");
	
		}
		}
}
