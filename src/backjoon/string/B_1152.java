package backjoon.string;

import java.util.Scanner;
import java.util.StringTokenizer;

//단어의 개수
public class B_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		System.out.println(st.countTokens());
		sc.close();
	}
}
