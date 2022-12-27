package backjoon.conditional;

import java.util.Scanner;

public class B_1330 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String flag = (a > b) ? ">" : ((a < b) ? "<" : "==");
		System.out.println(flag);
		sc.close();
	}
}
