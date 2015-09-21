package array;

public class ArrayChar {
	public static void main(String[] args) {
		char[] ch = new char[5];
		
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		ch[4] = '5';
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
