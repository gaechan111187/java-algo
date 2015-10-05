package comparison;

import java.util.Scanner;

/**
 * @file_name : StaticCalc.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 18.
 * @story     : 스태틱으로 만든 사칙연산 계산기
 */
public class StaticCalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요");
	//	StaticCalc calc = new StaticCalc();
	//  타입 인스턴스 = new 생성자
	//	calc.plus(scanner.nextInt(),scanner.nextInt()); 인스턴스 방식으로 접근해서 경고메시지가 발생
		System.out.println(StaticCalc.plus(scanner.nextInt(), scanner.nextInt()));
	}

}
class StaticCalc{
	static int result = 0; //멤버변수 중에서 클래스(스태틱) 변수
	public static int plus(int a, int b){   //매개변수 = 파라미터 = 매변   , 다만 파라미터는 초기화 할 필요가 없다.
//		int result = 0;   //지역변수=로컬변수   > 매변   .. 반드시 초기화 해야한다.
//		result = a+b;
//		return result;
		return a+b;
	}
	public static int minus(int a, int b){
		return a-b;
	}
	public static int multi(int a, int b){
		return a*b;
	}
	public static int divide(int a, int b){
		return a/b;
	}
}
