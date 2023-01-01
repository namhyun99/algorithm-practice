package backjoon.array;

import java.util.Scanner;

//평균은 넘겠지
public class B_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int[][] score = new int[test_case][];
		double[] avg = new double[test_case];
		
		for(int i=0; i<test_case; i++) {
			int sum = 0;
			int std = sc.nextInt();
			score[i] = new int[std];
			for(int j=0; j<std; j++) {
				score[i][j] = sc.nextInt();
				sum += score[i][j];
			}
			avg[i] = sum/ (double) std;
		}
		sc.close();
		
		for(int i=0; i<score.length; i++) {
			int cnt = 0;
			for(int j=0; j<score[i].length; j++) {
				if(score[i][j] > avg[i]) {
					cnt++;
				}
			}
			double result = (double)cnt/score[i].length*100;
			System.out.printf("%.3f%%\n", result);
		}
		
	}
}
