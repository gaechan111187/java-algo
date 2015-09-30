package loop;
/**
 * @file_name : Gugudan.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 25.
 * @story     : 책받침 구구단
 */
public class Gugudan {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				if (i==0) {
					System.out.print(j+"단\t");
				}
				else {
					System.out.print(j+"*"+i+"="+j*i+"\t");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				if (i==0) {
					System.out.print(j+"단\t");
				}
				else {
					System.out.print(j+"*"+i+"="+j*i+"\t");
				}
			}
			System.out.println();
		}
	}
}
