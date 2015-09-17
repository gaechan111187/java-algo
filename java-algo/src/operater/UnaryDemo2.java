package operater;
/**
 * @file_name : UnaryDemo2.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 16.
 * @story     : 단항연산자 문법(후위)
 */
public class UnaryDemo2 {
	public static void main(String[] args) {
		/**
		 * i++(후위 연산자)는 먼저 i 값을 호출한 후 연산한다. 
		 */
		int i=10, j=10;
		System.out.println("i++의 값 : "+ (i--));
		System.out.println(i--);
		System.out.println("i++의 값 : "+ (i--));
		System.out.println(i);
		
	}

}
