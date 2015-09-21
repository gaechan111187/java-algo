package practice;
/**
 * @file_name : ForPractice.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 18.
 * @story     : for문 연습
 */
public class ForPractice {
	public static void main(String[] args) {
		int c= 0;	
		for(int a=1; a<7; a++){
				 c = c+1;
				for (int i = 1; i < 7; i++) {
					System.out.print("*");
				if (c<=i) {break; }					
				}
				System.out.println("");				
		}
		//System.out.println("");
		int d = 6;
		for (int p = 1; p <6 ; p++) {
			d= d-1;
			 for (int j = 1; j < 6; j++) {
				 System.out.print("*");
				if (d <= j) {break;	}
			}
			 System.out.println("");
		}
	}
}
