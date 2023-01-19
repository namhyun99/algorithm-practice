package backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치 수 5
public class B_10870 {
	
	static int FNum(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		return FNum(N-1) + FNum(N-2);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(FNum(N));
	}
}
