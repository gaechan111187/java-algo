package comparison;

import java.util.Scanner;

/**
 * @file_name : SwitchTest2.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 18.
 * @story     : Switch 테스트
 */
public class SwitchTest2 {
	/**
	 *  To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 학생과 국어,영어 수학점수만 입력하면
	 * 충점, 평균, 합격여부가 출력되는 프로그램입니다.
	 * 오더는 다음과 같이 화면에 출력하려고 합니다.
	 * 학생		국어		영어		수학		총점		평균		합격여부
	 * =============================================================================
	 * 홍길동	90			90			90			270			90			(장학생)
	 * 합격여부는 다음과 같다고 합니다.
	 * 평균이 90점 이상이면 장학생
	 * 70점 이상 90점 미만이면 합격
	 * 70점 미만이면 불합격이라고 하네요
	 * 단) 평균에서 소수점이하는 절삭입니다.
	 */
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요");
		String name = scanner.next();
		System.out.println("국어 점수를 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = scanner.nextInt();
		int sum = kor+eng+math;
		int avg = sum/3; 
		int suc = avg/10;
		String fau = null;
		
		switch (suc) {
		case 7:	case 8:	fau = "합격"; break;
		case 9:	case 10:fau = "장학생";	break;
		default:
			fau = "불합격";	break;
		}
		System.out.println("학생		국어		영어		수학		총점		평균		합격여부");
		System.out.println("=======================================================================================================");
		System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%s",name,kor,eng,math,sum,avg,fau);//c언어 문법
}
}
