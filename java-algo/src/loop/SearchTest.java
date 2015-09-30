package loop;
/**
 * @file_name : SearchTest.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 25.
 * @story     : 특정 글자의 갯수 구하기
 */
public class SearchTest {
	/**
	 * [결과]
	 * 제시된 문장에서 특정 알파벳 존재 갯수
	 * "p는 9개 존재 합니다" 로 출력됨
	 */
	public static void main(String[] args) {
		String dest = "peter piper picked a peck of pickled pepers";
		String p = "p";
		boolean pfind = false;
		int pCount=0;
    	for (int i = 0; i < dest.length(); i++) {
			int searchCount = p.length();
			int destStartPoint = i;
			int searchStartPoint = 0;
				if (pfind = true) {
					pCount++;
				}
				}
    	System.out.println("제시된 문자열에서 p는 "+pCount+"가 존재합니다.");
			}
	}
