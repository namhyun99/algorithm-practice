package backjoon.loop;

import java.util.Scanner;

//별찍기 - 2
public class B_2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
