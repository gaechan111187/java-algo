package loop;

import java.util.Scanner;

/**
 * @file_name : SearchTest.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 25.
 * @story     : 특정 글자의 갯수 구하기
 */
public class SearchTest2 {
	/**
	 * [결과]
	 * 제시된 문장에서 특정 알파벳 존재 갯수
	 * "p는 9개 존재 합니다" 로 출력됨
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dest = "peter piper picked a peck of pickled pepers";
		System.out.println(dest);
		System.out.println("알파벳 입력하면 갯수를 찾아줌");
		String p = scanner.next();
		boolean pfind = false;
		int pCount=0;
test:	for (int i = 0; i < dest.length(); i++) {
			int searchCount = p.length();
			int destStartPoint = i;
			int searchStartPoint = 0;
			while (searchCount-- !=0) {
				if (dest.charAt(destStartPoint++) != p.charAt(searchStartPoint++)) {
					continue test;
				}
				else {
					pfind = true;
					pCount++;
				}
			}
		}
		System.out.println("제시된 문자열에서"+p+" 는 "+pCount+"가 존재합니다.");
	}

}
