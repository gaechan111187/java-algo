package practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.println("지방의 그램을 입력하세요");
		Scanner fat = new Scanner(System.in);
		System.out.println("탄수화물의 그램을 입력하세요");
		Scanner tan = new Scanner(System.in);
		System.out.println("단백질의 그램을 입력하세요");
		Scanner dan = new Scanner(System.in);
		String sum = (fat*9+tan*4+dan*4);		
		System.out.println("총칼로리는 "+sum+" cal");				
		
		
		
				
	}

}
