package javaprac.level1;

import java.util.Scanner;

public class Ex01 {
	/*
	 * 직사각형 별찍기
	 * 
	 * 입력 : 5 3
	 * 출력결과 
	 * *****
	 * *****
	 * *****
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a값 입력 : ");
		int a = sc.nextInt();
		System.out.print("b값 입력 : ");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
