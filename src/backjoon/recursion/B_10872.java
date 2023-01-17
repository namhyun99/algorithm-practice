package backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팩토리얼
public class B_10872 {
	
	public static int fac(int N) {
		if(N < 1) return 1;
		return N * fac(N-1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		System.out.println(fac(N));
	}
}
