package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//최댓값
public class B_2566 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int[][] arr = new int[9][9];
		
		int max = 0; //최대값
		int row = 0; //행
		int col = 0; //열
		
		for(int i=0; i<arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max || arr[i][j] == max) {
					max = arr[i][j];
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((row+1) + " " + (col+1));
	}
}
