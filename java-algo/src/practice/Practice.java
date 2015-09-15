package practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("지방의 그램을 입력하세요");
		Scanner f = new Scanner(System.in);
		String fa = f.next();
		System.out.println("탄수화물의 그램을 입력하세요");
		Scanner t = new Scanner(System.in);
		String ta = t.next();
		System.out.println("단백질의 그램을 입력하세요");
		Scanner d = new Scanner(System.in);
		String da = d.next();
		String s = da + fa + ta;
		System.out.println("총칼로리는 "+s+"cal 입니다.");
				
	}

}
