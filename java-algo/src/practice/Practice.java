package practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("지방의 그램을 입력하세요");
		int fa = scanner.nextInt();				
		System.out.println("탄수화물의 그램을 입력하세요");
		int ta = scanner.nextInt();
		System.out.println("단백질의 그램을 입력하세요");
		int da = scanner.nextInt();
		int s= fa*9+ta*4+da*4;
		System.out.println("총칼로리는 "+s+"cal 입니다.");
				
	}

}
