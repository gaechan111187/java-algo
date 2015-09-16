package variable;

import java.util.Scanner;

/**
 * @file_name : TaxTest.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 16.
 * @story     : 세금 출력 프로그램
 */

public class TaxTest {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***만원을 받으시는 홍길동님께서 납부할 세금은 ???만원입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세월이 정권이 바뀔 때 마다 변하니,
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현 정권은 세율이 9.7% 라고 합니다.
	 * 	 */
	public static void main(String[] args) {
		final double TX_R= 0.097;
		int salary; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = scanner.next();
		System.out.println("연봉을 입력하시오");
		salary = scanner.nextInt();
  //    tax = (int) (salary*TX_R);
		System.out.println("연봉 "+salary+"만원을 받으시는 "+ name+"께서 납부할 세금은 "+(int) (salary*TX_R)+"만원입니다.");				
			 
				
		
				
		
	}

}
