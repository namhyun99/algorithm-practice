package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//그룸 단어 체커
public class B_1316 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			boolean check = checkAlphabet(br.readLine());
			if(check) cnt++;
		}
		
		System.out.println(cnt);
		
	}

	
	private static boolean checkAlphabet(String s) {
		
		//알파벳 개수 26개 배열로 중복여부 체크
		boolean[] checkArr = new boolean[26]; 
		int pre = 0;
		
		for(int i=0; i<s.length(); i++) {
			int ch = s.charAt(i);
			
			if(pre != ch) {
				if(!checkArr[ch - 'a']) {
					checkArr[ch - 'a'] = true;
					pre = ch;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
