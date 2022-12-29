package backjoon.loop;

import java.util.Scanner;

//영수증
public class B_25304 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int count = sc.nextInt();
		int[] arr = new int[count];
		
		for(int i=0; i<count; i++) {
			int money = sc.nextInt();
			int cnt = sc.nextInt(); 
			arr[i] = money*cnt;
		}
		
		int sum = 0;		
		for(int i : arr) {
			sum += i;
		}
		
		if(total == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
