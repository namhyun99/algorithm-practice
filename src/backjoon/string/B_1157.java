package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 공부
public class B_1157 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		String s = br.readLine().toUpperCase();

		int max = -1;
		char ch = '?';
		
		for(int i=0; i< s.length(); i++) {
			int idx = s.charAt(i) - 'A';
			arr[idx]++;
			if(arr[idx] > max) {
				max = arr[idx];
				ch = s.charAt(i);
			} else if(max == arr[idx]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
