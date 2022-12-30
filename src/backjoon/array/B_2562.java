package backjoon.array;

import java.util.Scanner;

//최댓값
public class B_2562 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = 9;
		int max = 0;
		int[] arr = new int[size];
		
		//최대값 찾 기
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		sc.close();
		
		//몇번째 값인지 찾기
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i]) {
				idx = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(idx);
	}
}
