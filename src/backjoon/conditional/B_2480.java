package backjoon.conditional;

import java.util.Scanner;

//주사위 세개
public class B_2480 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;		
		
		if(a == b && b == c && c == a) { //숫자가 모두 같으면
			result = 10000 + a * 1000; 
		} else if (a != b && b != c && c != a) { //숫자가 모두 같지 않으면 최대값으로
			if(a > b && a > c) {
				result = a*100;
			} else if ( b > a && b > c) {
				result = b*100;
			} else {
				result = c*100;
			}
		} else { // 숫자가 둘중 하나만 맞으면
			if(a == b || a == c) { 
				result = 1000 + a * 100;
			} else if (b == c) {
				result = 1000 + b * 100;
			}
		}
		
		System.out.println(result);
		sc.close();
		
	}

}
