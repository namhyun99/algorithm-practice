package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//크로아티아 알파벳
public class B_2941 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<croatia.length; i++) {
			if(s.contains(croatia[i])) {
				s = s.replace(croatia[i], "0");
			}
		}
		
		System.out.println(s.length());
		
	}
}
