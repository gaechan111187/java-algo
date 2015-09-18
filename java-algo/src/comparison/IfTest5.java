package comparison;

import java.util.Scanner;

/**
 * * @file_name : IfTest2.java
 * 
 * @author : chanhok61@daum.net
 * @date : 2015. 9. 17.
 * @story : if테스트
 */
public class IfTest5 {
	/**
	 * To. 개발자님 프로그램을 하나 개발해야 합니다. 교수는 학생 평균을 입력하면 1등학생을 출력하는 프로그램을 만들어주세요 오더는
	 * 다음과 같이 화면에 출력하려고 합니다. 
	 * ***학생이 1등입니다.
	 * 총 3명입니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1번학생 이름을 입력하시오");
		String name1 = scanner.next();
		System.out.println("1번학생 평균을 입력하시오");
		int avg1 = scanner.nextInt();
		if (0 > avg1 || 100 < avg1) {
			System.out.println("1번학생 점수를 확인하세요");
			return;
		}
		System.out.println("2번학생 이름을 입력하시오");
		String name2 = scanner.next();
		System.out.println("2번학생 평균을 입력하시오");
		int avg2 = scanner.nextInt();
		if (0 > avg2 || 100 < avg2) {
			System.out.println("2번학생 점수를 확인하세요");
			return;
		}
		System.out.println("3번학생 이름을 입력하시오");
		String name3 = scanner.next();
		System.out.println("3번학생 평균을 입력하시오");
		int avg3 = scanner.nextInt();
		if (0 > avg3 || 100 < avg3) {
			System.out.println("3번학생 점수를 확인하세요");
			return;
		}
		String fir=null ;
		if (avg1>avg2 && avg1>avg3) {
			fir = name1;		}
		else if (avg2>avg3) {
			fir = name2	;	}
		else {
			fir = name3;	}
		System.out.println(fir+"학생이 1등입니다.");	
	}
	}
