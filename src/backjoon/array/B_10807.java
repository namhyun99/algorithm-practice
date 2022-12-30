package backjoon.array;

import java.util.Scanner;

//개수 세기
public class B_10807 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i < size; i++) {	
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int cnt = 0;
		int check = sc.nextInt();
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == check) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
