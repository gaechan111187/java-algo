package practice;

import java.util.Scanner;

public class MaxMinPrac {
	public static void main(String[] args) {
		int n=0, max=0, min=100, input=0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 크기");
		n = scanner.nextInt();
		int [] num = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(i+1 + "번째 수 입력");
			input = scanner.nextInt();
			num[i] = input;
			if (num[i]<min) {
				min = num[i];
			}
			if (num[i]>max) {
				max = num[i];
			}
		}System.out.println("최대값:"+max+", 최소값:"+min);
	}

}
