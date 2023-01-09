package backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//수 정렬하기 3
public class B_10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		 
		 int N = Integer.parseInt(br.readLine());
		 int[] arr = new int[N];
		 
		 for(int i=0; i<N; i++) {
			 arr[i] = Integer.parseInt(br.readLine());
		 }
		 
		 Arrays.sort(arr);
		 
		 StringBuilder sb = new StringBuilder();
		 for(int i=0; i<N; i++) {
			 sb.append(arr[i]).append("\n");
		 }
		 
		 System.out.println(sb);
		 
	}
}
