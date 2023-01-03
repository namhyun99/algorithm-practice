package backjoon.string;

import java.io.IOException;
import java.util.Scanner;

//상수
public class B_2908 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = "";
		String d = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			c += a.charAt(i);
			d += b.charAt(i);
		}

		if (Integer.parseInt(c) > Integer.parseInt(d)) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}

		sc.close();
	}
}
