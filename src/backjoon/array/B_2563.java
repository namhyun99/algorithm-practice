package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//색종이
public class B_2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0; //검은 영역의 넓이
		int N = Integer.parseInt(br.readLine()); //색종이 갯수
		boolean[][] arr = new boolean[100][100]; //도화지
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(!arr[j][k]) {
						arr[j][k] = true;
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
		
	}
}
