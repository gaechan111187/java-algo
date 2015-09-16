package operater;
/**
 * @file_name : UnaryTest.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 16.
 * @story     : 단항연산자 예제
 */
public class UnaryTest {
	public static void main(String[] args) {
		/**
		 * int x=5 ,y=10,z=0
		 * z = (x++) + (++x) + (y++)
		 * System.out.println("z의 값은"+ z);
		 */
		/**
		 * 문제 : 정수형 변수 x = 5, y = 10, z = 0 일 때
		 */
		int x = 5, y = 10, z = 0 ;
		// z = x 후위 + x전위 + y후위의 식을 연산자를 사용해서 완성하고
		//z의 결과값을 출력하시오. 그리고 그 이유를 설명하시오.
		//System.out.println(x++);
		System.out.println(++x);
		
		z = (x++) + (++x) + (y++);
		System.out.println("z의 값은"+ z);
		// x++ 5 ++x 7 y++ 10
		
	}

}
