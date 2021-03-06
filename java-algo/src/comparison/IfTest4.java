package comparison;

import java.util.Scanner;

/**
 * * @file_name : IfTest2.java
 * 
 * @author : chanhok61@daum.net
 * @date : 2015. 9. 17.
 * @story : if테스트
 */
public class IfTest4 {
	/**
	 * To. 개발자님 프로그램을 하나 개발해야 합니다. 교수는 학생 평균을 입력하면 등수를 알려주는 기능을 추가해 달랍니다. 오더는
	 * 다음과 같이 화면에 출력하려고 합니다. 학생이름 : 홍길동 (2) 학생이름 : 김유신 (1) 학생이름 : 강감찬 (3) 단)학생은
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
		String fi = null;
		String se = null;
		String th = null;
						
		if (avg1 > avg2 && avg1 > avg3) {
			fi = name1;
			if (avg2>avg3) {
				se = name2;
				th = name3;
						}
			else {
				se = name3;
				th = name2;
					}
		}
		else if (avg2>avg3 && avg2>avg1) {
			fi = name2;
			if (avg1>avg3) {
				se = name1;
				th = name3;
			}
			else {
				se = name3;
				th = name1;
			}
		}
		else {
			fi = name3;
			if (avg1>avg2) {
				se = name1;
				th = name2;
			}
			else {
				se = name2;
				th = name1;
			}
		} System.out.println("1등학생 : "+fi+", 2등학생 : "+se+", 3등학생 : "+th);
	} 
}

		