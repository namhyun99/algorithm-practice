package backjoon.conditional;

import java.util.Scanner;

//알람 시계
public class B_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt(); //시간
		int min = sc.nextInt(); //분

		min = min-45;
		if (min < 0) {
			hour = hour - 1;
			min = min + 60;
			if(hour < 0) {
				hour = 23;
			}
		}

		System.out.println(hour + " " + min);
		sc.close();
	}
}
