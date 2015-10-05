package loop;

import java.util.Scanner;

/**
 * @file_name : NumberNear.java
 * @author : chanhok61@daum.net
 * @date : 2015. 10. 5.
 * @story : 가까운 수 구하기
 */
public class NumberNear {
	/**
	 * [결과] 다음 배열이 있을 때 입력받은 수와 가장 가까운 수를 구하시오 단, 동일 갭이면 작은 수를 선택한다.
	 */
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		// 입력값과 차이값
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int gap = 0,result = 0,min=1000000, target = scanner.nextInt();
		for (int i = 0; i < arr.length; i++) {
			gap = Math.abs(target - arr[i]);
			if (gap<min && gap!=0) {
				min = gap;
				result = arr[i];
			}
		}
		System.out.println("결과 : "+result );
	}
}
