package backjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//재귀의 귀재
public class B_25501 {
	
	public static int cnt=0;
	
	public static int recursion(String s, int l, int r) {
		cnt++;
		if(l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r))	return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static int isPalindrome(String s) {
		cnt=0;
		return recursion(s, 0, s.length()-1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder Builder = new StringBuilder();
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			Builder.append(isPalindrome(s));
			Builder.append(" ");
			Builder.append(B_25501.cnt);
			Builder.append("\n");
		}
		
		System.out.println(Builder);
		
	}
}
