package comparison;

import java.util.Scanner;

/**
 * @file_name : TimeCalc.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 입력된 시간(초)를 시간, 분, 초로 환산하기
 */
public class TimeCalc {
	/**
	 * To.개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	 * 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	 * 그러니까 500초면  뭐 몇시간 몇분 몇로라고 보여주면 좋겠죠.
	 */
	public static void main(String[] args) {
		int second = 0, min1 = 0, min2=0, hour1=0, hour2=0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하시오");
		second = scanner.nextInt();
		if (second<60) {
			System.out.println(second+"초입니다.");return;
		}
		min1 = second/60 ;
		min2 = second%60 ;
		if (min1>=60) {
			hour1 = min1/60;
			hour2 = min1%60;
			System.out.println(hour1+"시간"+hour2+"분"+min2+"초 입니다.");return;
		}
		System.out.println(min1+"분"+min2+"초 입니다.");
	}
}
