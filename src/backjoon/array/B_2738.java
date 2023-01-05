package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2738 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] aArr = new int[N][M];
		int[][] bArr = new int[N][M];
		
		for(int i=0; i<aArr.length; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<aArr[i].length; j++) {
				aArr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<bArr.length; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<bArr[i].length; j++) {
				bArr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sb.append(aArr[i][j] + bArr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
