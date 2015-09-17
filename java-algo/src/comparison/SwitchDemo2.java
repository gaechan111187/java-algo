package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchDemo.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 17.
 * @story     : 스위치 문법
 */
public class SwitchDemo2 {
	public static void main(String[] args) {
		//int month = Inteager.parseInt(args[0]);
		//리터럴 : 문자열리터럴
		//int month = Integer.parseInt("2");
		//System.out.println(month);
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scanner.nextInt();
		
		String res = null ; //지역변수는 반드시 초기화를 해 주어야 한다.
		switch (month) {
		case 1:		case 3:		case 5:		case 7:		case 8:		case 10:		case 12:
		    res ="31";break;
		
		case 4:		case 6:		case 9:		case 11:			
			res = "30";break;			
		case 2:
			res = "29"; break;
			
		default:
			System.out.println("다시입력하세요"); return;
		}System.out.println(month+"월은 " +res+"일까지 입니다.");
		
	}
	}

