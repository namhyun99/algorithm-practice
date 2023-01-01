package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//OX퀴즈
public class B_8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		br.close();
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 0; //연속 갯수
			int sum = 0; //합계
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
