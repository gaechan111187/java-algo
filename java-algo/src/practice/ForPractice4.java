package practice;
/**
 * @file_name : ForPractice3.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 예제3
 */

public class ForPractice4 {
	public static void main(String[] args) {
		
		int n=27;
		for (int i = 0; i < 26; i++) {
			n= n-1;
			char ch = 65;
			for (int j = 1; j < 27; j++) {
				System.out.print(ch++);
				if (n<=j) {break;
				}
			}
			System.out.println("");
		}
	}
}
