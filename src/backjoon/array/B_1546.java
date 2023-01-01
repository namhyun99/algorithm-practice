package backjoon.array;

import java.util.Scanner;

//평균
public class B_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		double[] score = new double[size];

		double max = 0;
		for(int i=0; i<size; i++) {
			score[i] = sc.nextInt();			
			if(score[i] > max) max = score[i];
		}
		sc.close();
		
		double sum = 0;
		for(int i=0; i<size; i++) {
			sum += score[i]/max*100;
		}
		double avg = sum / size;
		System.out.println(avg);
	}
}
