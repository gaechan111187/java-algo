package array;

import java.util.Scanner;

/**
 * @file_name : ArrayTen.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : int타입 배열 요소의 합
 */
public class ArrayTen {
	/**
	 * 1 부터 10까지의 합 구하기(옵션 : 배열로)
	 */
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5};
		int sum = 0;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= i+1;
			sum += arr[i];
		}
		//for (int i = 0; i < arr.length; i++) {
			//sum += arr[i];
		//}
			System.out.println(sum);
		}
	}
	
