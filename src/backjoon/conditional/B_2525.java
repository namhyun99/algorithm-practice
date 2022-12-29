package backjoon.conditional;

import java.util.Scanner;

//오븐 시계
public class B_2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //시
		int m = sc.nextInt(); //분
		int t = sc.nextInt(); //작동시간

		int min = (h*60) + m; // 총시간 으로 변경
		min += t;
		
		int hour = (min/60) % 24;
		int min2 = min % 60;
		
		System.out.println(hour + " " + min2);
		sc.close();
		
	}
}
