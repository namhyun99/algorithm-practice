package backjoon.loop;

import java.util.Scanner;

//A+B -8
public class B_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			aArr[i] = a;
			bArr[i] = b;
		}
		
		for(int i=0; i<n; i++) {
			int sum = aArr[i]+bArr[i];
			System.out.println("Case #" + (i+1) + ": " 
					+ aArr[i] + " + " + bArr[i] + " = " + sum);
		}
		sc.close();
		
	}
}
