package backjoon.loop;

import java.util.Scanner;

//더하기 사이클
public class B_1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int tmp = num;
		int cnt = 0;
		
		while(true) {
			int a = tmp % 100 / 10; //10자리수 구하기
			int b = tmp % 10; // 1자리수 구하기
			tmp = b * 10 + (a+b) % 10; 
			cnt++;
			if(num == tmp) break;
		}
		
		System.out.println(cnt);
		sc.close();
		
	}
}
