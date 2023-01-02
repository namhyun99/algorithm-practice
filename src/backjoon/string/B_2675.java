package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문자열 반복
public class B_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				
		int test_case = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < test_case; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int len = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<len; k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
