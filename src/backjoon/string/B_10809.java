package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//알파벳 찾기
public class B_10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			int idx = s.charAt(i)-'a';
			if(arr[idx] == -1) {
				arr[idx] = i;
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
