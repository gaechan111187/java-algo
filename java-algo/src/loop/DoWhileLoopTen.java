package loop;

import java.util.Scanner;

/**
 * @file_name : WhileLoopTen.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 24.
 * @story     : 
 */
public class DoWhileLoopTen {
	public static void main(String[] args) {
		int i = 0;
		
		do{
			i++;
			System.out.print(i+"\t");
			}while (i<10) ;
		System.out.println();
		for (int j = 0; j < 10; j++) {
			System.out.print(j+"\t");
		}
	}
}
